pipeline{
    agent any
    stages {
        stage('Builld'){
            steps{
                echo 'Build'
            }
        }
        stage('Test'){
            steps{
                echo 'Test'
            }
        }
    }
}