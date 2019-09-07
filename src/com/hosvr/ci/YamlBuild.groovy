/*
	src/com/hosvr/ci/YamlDefinition.groovy
*/

package com.hosvr.ci

class YamlDefinition implements Serializable {
	def script
	def config


	def YamlBuild(script, config) {
		this.script = script
		this.config = config
	}


	def initializeBuild(){
		script{
			for (key in config.keySet()){
				print(key)
			}
		}
	}

}
