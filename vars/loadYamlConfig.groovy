/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile, envVars, scmVars){

  stage('Initialize'){
    checkout scm

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config, envVars, scmVars)

    build.initialize()
  }

  stage('Print stuff'){
    print(build.scmVars)
    print(build.envVars)
  }

}
