/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile, envVars){

  stage('Initialize'){
    checkout scm

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config, envVars)

    build.initialize()
  }

  stage('Print stuff'){
    script.env.dump()
  }

}
