/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile){

  stage('Initialize'){
    checkout scm

    envString = sh(script: "printenv", returnStdout: true,).trim()

    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config, this.scm)

    def options = build.initialize()
    print(options.dump())
  }

  stage('Scm Vars'){
    print("WITHIN THE SCM VARS STAGE")
    print(scm.dump())
    // print(options.dump()) -> Out of scope from stage('Initialize').options
  }

}
