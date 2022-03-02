pipeline {

    def app
    
    stage('Clone repository') {
      
        checkout scm
    }

    stage('Build image') {
  
       app = docker.build("hmaussa1/demo")
    }
}