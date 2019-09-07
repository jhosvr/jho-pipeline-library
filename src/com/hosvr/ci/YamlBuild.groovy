/*
	src/com/hosvr/ci/YamlBuild.groovy
*/

package com.hosvr.ci

class YamlBuild implements Serializable {
	def script

	def YamlBuild(script) {
		script = this.script
	}

	def start(){
		script.node {
      echo "YamlBuild.start() called"
		}
	}
}
