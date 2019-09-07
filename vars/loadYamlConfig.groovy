/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile){
  script{
    checkout scm

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config)

    build.initialize()
  }
}
