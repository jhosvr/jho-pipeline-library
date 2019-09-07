/*
  vars/loadYamlConfig.groovy
*/

import com.hosvr.ci.PipelineYaml

def call(script, yamlFile, envVars, scmVars){

  stage('Initialize'){
    checkout scm

    environment = sh(script: "printenv" returnStdout: true,).trim()
    print(environment.getClass())
    print(environment.dump())
    print(environment)
    
    def config = readYaml(file: yamlFile)
    build = new PipelineYaml(this, config, envVars, scmVars)

    def options = build.initialize()
    print(options.dump())
  }

  stage('Print stuff'){
    print(build.scmVars.dump())
    print(build.envVars.dump())
    sh "env"
    // print(options.dump()) -> Out of scope from stage('Initialize').options
  }

}
