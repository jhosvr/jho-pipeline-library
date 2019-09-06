/*
	src/com/hosvr/ci/PipelineBuild.groovy
*/

package com.hosvr.ci

class PipelineBuild implements Serializable {
	def script
	def envVars
	def scmVars
	def buildType

	def PipelineBuild(script, envVars, scmVars, buildType) {
		this.script = script
		this.envVars = envVars
		this.scmVars = scmVars
		this.buildType = buildType
	}

	def start(){
		script.node {
			script.stage('Checkout SCM'){
				script.checkout scmVars
			}

			script.stage('Build'){
				switch(this.buildType){
					case 'helloWorld':
						script.helloWorld(script)
						break
					case 'django':
						script.djangoPipeline(script)
						break
					default:
						script.echo('No pipeline build was specified')
						break
				}
			}

			script.stage('Deploy'){
				script.echo('Straight to PROD!')
			}


		}
	}
}
