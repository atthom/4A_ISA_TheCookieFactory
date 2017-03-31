node {
  def mavenHome = tool name: 'Maven'
  env.PATH = "${mavenHome}/bin:${env.PATH}"
}

pipeline {
  agent any
  stages {
    stage('Build Entites') {
      steps {
          sh 'cd j2e && mvn deploy -pl entities'
   //     sh 'cd j2e/entities && mvn clean install'     
   //     sh 'cd j2e && mvn clean package'       
      }
    }
    stage('Build Bank-API') {
      steps {
          sh 'cd j2e && mvn deploy -pl bank-api'
        //sh 'cd j2e/bank-api && mvn clean install'
      }
    }
    stage('Build customer-registry') {
      steps {
          sh 'cd j2e && mvn deploy -pl customer-registry'
        //sh 'cd j2e/kitchen && mvn clean install'
      }
    }

    stage('Build Kitchen') {
      steps {
          sh 'cd j2e && mvn deploy -pl kitchen'
        //sh 'cd j2e/kitchen && mvn clean install'
      }
    }

    stage('Build Cashier') {
      steps {
          sh 'cd j2e && mvn deploy -pl cashier'
        //sh 'cd j2e/cashier && mvn clean install'
      }
    }
    stage('Build Catalogue') {
      steps {
          sh 'cd j2e && mvn deploy -pl catalogue'
        //sh 'cd j2e/catalogue && mvn clean install'
      }
    }
    stage('Build Cart-web-service') {
      steps {
          sh 'cd j2e && mvn deploy -pl cart-web-service'
      //  sh 'cd j2e/cart-web-service && mvn clean install'
      }
    }
    stage('Build Customer-care-service') {
      steps {
          sh 'cd j2e && mvn deploy -pl customer-care-service'
        //sh 'cd j2e/customer-care-service && mvn clean install'
      }
    }
    stage('Run Tests') {
      steps {
          sh 'cd j2e && mvn deploy -pl tcf-test'
        //sh 'cd j2e/tcf-test && mvn clean install'
      }
    }
  }
}