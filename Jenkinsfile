pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                sh './mvnw package'
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build('voting-machine-app')
                }
            }
        }
    }
}
