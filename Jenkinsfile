pipeline {
    agent any

    stages {
        stage('Download maven') {
            steps {
                echo 'Download Maven..'
                sh "curl https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz --output maven.tar.gz"
                sh "tar -zxvf maven.tar.gz"
            }
        }

        stage('Build') {
            steps {
                echo 'Building2..'
                sh "./apache-maven-3.8.6/bin/mvn install -DskipTests"
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh "./apache-maven-3.8.6/bin/mvn test"
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
