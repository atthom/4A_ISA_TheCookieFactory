node {
  def mavenHome = tool name: 'Maven'
  env.PATH = "${mavenHome}/bin:${env.PATH}"
}

pipeline {
  agent any
  stages {
    stage('Build Entites') {
      steps {
        sh 'cd j2e && mvn install -pl entities'
      }
    }
    stage('Stream 1') {
      steps {
        parallel(
          "Build Bank-API": {
            sh 'cd j2e && mvn install -pl bank-api'
            
          },
          "Build Kitchen": {
            sh 'cd j2e && mvn install -pl kitchen'
            
          },
          "Customer Registery": {
            sh 'cd j2e && mvn install -pl customer-registry'
            
          },
          "Catalogue": {
            sh 'cd j2e && mvn install -pl catalogue'
            
          }
        )
      }
    }
    stage('Stream 2') {
      steps {
        parallel(
          "Build Cashier": {
            sh 'cd j2e && mvn install -pl cashier'
            
          },
          "Customer-care-service": {
            sh 'cd j2e && mvn install -pl customer-care-service'
            
          }
        )
      }
    }
    stage('Build Cart-web-service') {
      steps {
        sh 'cd j2e && mvn install -pl cart-web-service'
      }
    }
    stage('Run Tests') {
      steps {
        sh 'cd j2e && mvn install -pl tcf-test'
      }
    }
    stage('Deploy') {
      steps {
        echo 'deploying'
      }
    }
  }
}