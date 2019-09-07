/*
	src/com/hosvr/ci/PipelineYaml.groovy
*/

package com.hosvr.ci

class PipelineYaml implements Serializable {
	def script
	def config
	def scmVars

	def PipelineYaml(script, config, scmVars) {
		this.script = script
		this.config = config
		this.scmVars = scmVars
	}


	def initialize(){

		def keys = config.keySet() as List
		script.print(scm.dump())
		return keys

	}

	def start(){
		//defineAgent()
		//defineEnvironment()
		//defineOptions()

		return True
	}


}
