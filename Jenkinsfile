pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building2..'
                mvn install
            }
        }
        stage('Test2') {
            steps {
                echo 'Testing..'
                mvn test
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
