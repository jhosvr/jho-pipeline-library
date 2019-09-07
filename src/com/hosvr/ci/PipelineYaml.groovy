/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config
	def scm

	def PipelineYaml(script, config, scm) {
		this.script = script
		this.config = config
		this.scm = scm
	}


	def initialize(){

		def keys = config.keySet() as List
		script.print(scm.dump())
		return keys

	}


	def start(){
		defineAgent()
		defineEnvironment()
		defineOptions()
		return True
	}


	def defineAgent(){ return True }
	def defineEnvironment(){ return True }
	def defineOptions(){ return True }

}
