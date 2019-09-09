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


	def start(){
		defineAgent()
		defineEnvironment()
		defineOptions()
		return True
	}


	def defineAgent(){
		if (agent.label == null ) ||  (agent.label == "any") {
			script.agent = any
		}
	}

	def defineEnvironment(){ return True }
	def defineOptions(){ return True }

}
