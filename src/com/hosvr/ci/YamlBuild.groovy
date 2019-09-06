/*
	src/com/hosvr/ci/YamlBuild.groovy
*/

package com.hosvr.ci

class YamlBuild implements Serializable {
	def script
	def envVars
	def scmVars
	def buildType

	def YamlBuild(script) {
		this.script = script
	}

	def start(){
		script.node {
      echo "YamlBuild.start() called"
		}
	}
}
