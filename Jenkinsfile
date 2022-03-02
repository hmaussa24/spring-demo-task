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
				git 'https://github.com/hmaussa24/demo-jenkins.git'
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