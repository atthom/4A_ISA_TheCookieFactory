pipeline {
def mvnHome = tool name: "Maven"
    env.PATH = "${mvnHome}/bin:${env.PATH}"
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'hello'
        sh 'cd j2e && mvn clean package'
      }
    }
   
    stage('Deploy') {
      steps {
        echo 'deploying'
      }
    }
  }
}