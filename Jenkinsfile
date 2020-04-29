pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker ps'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}