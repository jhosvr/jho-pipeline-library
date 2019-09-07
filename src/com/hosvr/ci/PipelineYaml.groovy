/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config
	def env

	def PipelineYaml(script, config, envVars) {
		this.script = script
		this.config = config
		this.envVars = envVars
	}


	def initialize(){

		for (key in config.keySet()){
			script.print(key)
		}

		script.print(envVars.dump())
	}

}
