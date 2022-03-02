pipeline {
	environment {
		registry = "hmaussa1/demo"
		registryCredential = 'dockerhub'
		dockerImage = ''
	}
	agent any
	stages {
		stage('Cloning our Git') {
			steps {
				git 'https://icloudseven.visualstudio.com/IC7%20MICROSERVICES/_git/IC7-MICROSERVICE-BACK'
			}
		}
		stage('Building our image') {
		    steps{
		        bat 'mvn -Dmaven.test.failure.ignore=true install'
		        script {
					dockerImage = docker.build registry + ":$BUILD_NUMBER"
				}
		    }
		}
		stage('Deploy our image') {
			steps{
				script {
					docker.withRegistry( '', registryCredential ) {
					dockerImage.push()
					}
				}
			}
		}
	}
}