pipeline {
    agent any
    stages{
        stage('Pull'){
            steps{
                git 'https://github.com/sushantkamble-sys/time-tracker.git'
            }
        }
        stage('Build'){
            steps{
                echo 'Successfully build'
            }
        }
        stage('test'){
            steps{
                echo 'Successfully test'
            }
        }
        stage('pre-prod'){
            steps{
                echo 'Successfully deployed'
            }
        }
    }
}