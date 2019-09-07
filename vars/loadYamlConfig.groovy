/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.YamlBuild

def call(script, yamlFile){
  checkout scm

  def pipelineDefinition = readYaml(file: yamlFile)
  print(pipelineDefinition.dump())

  build = new YamlBuild(this, pipelineDefinition)
  print(build.dump())

  build.start()

}

