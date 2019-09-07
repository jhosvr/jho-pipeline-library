/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.YamlBuild

def call(Script script, String yamlFile){
  checkout scm

  def pipelineDefinition = readYaml file: yamlFile
  print(pipelineDefinition.dump())

  build = new YamlBuild(script = this, config = pipelineDefinition)
  print(build.dump())

  build.start()

}

