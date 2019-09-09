/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config
	def scm

	def PipelineYaml(script, config) {
		this.script = script
		this.config = config
	}


	def initialize(){

		def keys = config.keySet() as List
		return keys

	}


	def defineAgent(){
		if (config.agent.type == null || config.agent.type == "any") {
			script.config.agent.type = "top"
		}

		sh "Agent config.agent.type has been defined as: ${config.agent.type}"
	}


}
