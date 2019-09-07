/*
	src/com/hosvr/ci/YamlBuild.groovy
*/

package com.hosvr.ci

class YamlBuild implements Serializable {
	def script
	def config

	def YamlBuild(script, config) {
		this.script = script
		this.config = config
	}

	def start(){
    for (directive in config){
			script.print(directive)
		}
	}

	def initialize(){
		
		for (key in config.keySet()){
			script.print(each)
		}

	}

}
