/*
  Jenkinsfile.sample
  This is the sample Jenkinsfile to be included in a repository in order to load a Yaml config
*/

@Library('hosvr_pipeline_library@yaml-config') _

node {
  stage('Load Definition') {
    loadYamlConfig(script = this, yamlFile = 'sample.yaml')
  }
}
