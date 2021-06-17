pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building App ........'
            }
        }
		        stage('Test') {
            steps {
                echo 'Testing App ........'
            }
        }
		        stage('Deploy') {
            steps {
                echo 'Deploying App .......'
            }
        }
    }
	post {
        always {
            emailext body: 'Testing Jenkins Jobs has failed', subject: 'Jenkins Job Failed', to: 'imdmstar@gmail.com'
        }
    }
}
