/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.*

def call(String yamlFile){
  def pipeline = readYaml file: yamlFile
  print(pipeline.dump())

  build = new YamlBuild()
  build.start()
}