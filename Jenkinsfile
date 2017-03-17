pipeline {
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