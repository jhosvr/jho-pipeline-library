/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.YamlBuild

def call(String yamlFile){
  checkout scm
  def pipeline = readYaml file: yamlFile
  print(pipeline.dump())

  build = new YamlBuild(this)
  print(build.dump())
  build.start()
}

