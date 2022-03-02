pipeline {
  environment {
    registry = "hmaussa1/docker-test"
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://icloudseven.visualstudio.com/IC7%20MICROSERVICES/_git/IC7-MICROSERVICE-BACK'
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
  }
}