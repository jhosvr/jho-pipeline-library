/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile){

  stage('Initialize'){
    checkout scm

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config)

    build.initialize()
  }

  stage('Print stuff'){
    print(build.dump())
  }

}
