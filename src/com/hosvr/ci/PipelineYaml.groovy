/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config


	def PipelineYaml(script, config) {
		this.script = script
		this.config = config
	}


	def initialize(){

		for (key in config.keySet()){
			print(key)
			}
			
	}

}
