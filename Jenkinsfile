pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                dir ('TDD-Java-Course'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                dir ('TDD-Java-Course'){
                    sh 'mvn test'
                }
            }
        }
        stage('Sonar') {
            steps {
                dir ('TDD-Java-Course'){
                    sh 'mvn sonar:sonar \
                        -Dsonar.projectKey=TDD-Java_sonar \
                        -Dsonar.projectName=TDD-Java_sonar \
                        -Dsonar.sources=src/main \
                        -Dsonar.host.url=http://192.168.1.133:9000 \
                        -Dsonar.login=f95563719b88491ca95b901413d99af5da1dc779'
                }
            }
        }
    }
}