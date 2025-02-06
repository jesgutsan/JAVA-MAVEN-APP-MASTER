pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }
        stage("run tests") {
            steps {
                script {
                    sh 'mvn test'
                }
                junit 'target/surefire-reports/*.xml'
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building image"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                }
            }
        }
    }
}