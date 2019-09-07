/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.*

def call(String yamlFile){
  checkout scm
  def pipeline = readYaml file: yamlFile
  print(pipeline.dump())

  build = new YamlBuild()
  print(build.dump())
  // build.start()
}