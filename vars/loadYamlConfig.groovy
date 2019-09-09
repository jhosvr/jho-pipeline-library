/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile){

  stage('Initialize'){
    checkout scm

    envString = sh(script: "printenv", returnStdout: true,).trim()

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config)

    def options = build.initialize()

    build.defineAgent()

  }

  stage('Scm Vars'){
    node("${build.config.agent.type}"){
      sh "I made it!"
    }
  }

}
