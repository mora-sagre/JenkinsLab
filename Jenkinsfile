pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                dir ('TDD-Java-Course'){
                    sh 'mvn clean test'
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
                        -Dsonar.host.url=http://56edc504b05e:9000 \
                        -Dsonar.login=c938a723f27187af49ed5dfb0aafcad0719e0edb'
                }
            }
        }
    }
}