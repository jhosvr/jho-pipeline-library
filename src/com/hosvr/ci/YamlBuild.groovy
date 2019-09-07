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
    script.echo "YamlBuild.start() called"
	}
	
}
