/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config
	def envVars
	def scmVars

	def PipelineYaml(script, config, envVars, scmVars) {
		this.script = script
		this.config = config
		this.envVars = envVars
		this.scmVars = scmVars
	}


	def initialize(){

		def keys = config.keySet() as List
		return keys
	}

}
