pipeline {
  agent any

  tools {
    jdk 'jdk17'      // Configure a JDK named 'jdk17' in Jenkins > Global Tool Configuration
    maven 'maven3'   // Configure Maven named 'maven3'
  }

  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/Aakankshavr/Devopsdemo.git'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn -B test'
      }
      post {
        always { junit 'target/surefire-reports/*.xml' }
      }
    }
    stage('Package (Jar)') {
      steps {
        sh 'mvn -B clean package'
      }
    }
  }
  post {
    success { echo 'Build & Tests passed!' }
  }
}