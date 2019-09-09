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


	def inAgent(steps){
		if (config.agent.type == null || config.agent.type == "any") {
			node(label: 'top') {	
				steps }
		}
	}


}
