/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.YamlBuild

def call(script, yamlFile){
  checkout scm

  def pipelineDefinition = readYaml(file: yamlFile)

  build = new YamlBuild(this, pipelineDefinition)

  build.start()

}
