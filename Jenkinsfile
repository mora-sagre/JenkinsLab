pipeline {
    agent any
    tools {
        docker 'docker'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'docker ps'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}