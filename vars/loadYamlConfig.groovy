/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.YamlBuild

def call(script, yamlFile){
  checkout scm

  def config = readYaml(file: yamlFile)

  build = new YamlBuild(this, config)

  build.initializeConfigKeys()

}
