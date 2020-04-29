pipeline {
    agent none
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