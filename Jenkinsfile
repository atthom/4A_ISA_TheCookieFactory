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
        //sh 'cd j2e'
        sh 'cd j2e/entities && mvn clean install'

        sh 'cd j2e/bank-api && mvn clean install'
        //sh 'mvn clean package'
        sh 'cd j2e/cart-web-service && mvn clean install'

        sh 'cd j2e/cashier && mvn clean install'

        sh 'cd j2e/catalogue && mvn clean install'

        sh 'cd j2e/customer-care-service && mvn clean install'
        
        sh 'cd j2e/customer-registry && mvn clean install'
        
        sh 'cd j2e/kitchen && mvn clean install'

        sh 'cd j2e/tcf-test && mvn clean install'
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