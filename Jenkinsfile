node {
  def mavenHome = tool name: 'Maven'
  env.PATH = "${mavenHome}/bin:${env.PATH}"
}

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'hello'
        sh 'cd j2e'
        sh 'cd bank-api'
        sh 'mvn clean package'
        sh 'cd ..\cart-web-service'
        sh 'mvn clean package'
        sh 'cd ..\cashier'
        sh 'mvn clean package'
        sh 'cd ..\catalogue'
        sh 'mvn clean package'
        sh 'cd ..\customer-care-service'
        sh 'mvn clean package'
        sh 'cd ..\customer-registry'
        sh 'mvn clean package'
        sh 'cd ..\entities'
        sh 'mvn clean package'
        sh 'cd ..\kitchen'
        sh 'mvn clean package'
        sh 'cd ..\tcf-test'
        sh 'mvn clean package'
   //     sh 'cd j2e && mvn clean package'
   //     sh 'mvn -f j2e\bank-api\pom.xml clean package'
   //     sh 'mvn -f j2e\cart-web-service\pom.xml clean package'
    //    sh 'mvn -f j2e\cashier\pom.xml clean package'
    //    sh 'mvn -f j2e\catalogue\pom.xml clean package'
    //    sh 'mvn -f j2e\customer-care-service\pom.xml clean package'
    //    sh 'mvn -f j2e\customer-registry\pom.xml clean package'
    //    sh 'mvn -f j2e\entities\pom.xml clean package'
    //    sh 'mvn -f j2e\kitchen\pom.xml clean package'
    //    sh 'mvn -f j2e\tcf-test\pom.xml clean package'        
      }
    }
   
    stage('Deploy') {
      steps {
        echo 'deploying'
      }
    }
  }
}