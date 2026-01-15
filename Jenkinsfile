pipeline {
    agent any

    tools {
        maven "Default Maven"
    }

    stages {
        stage("SCM") {
            steps {
                checkout scm
            }
        }

        stage("SonarQube Analysis") {
            steps {
                withSonarQubeEnv("SonarQube") {
                    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=calculatrice1 -Dsonar.projectName=Calculatrice"
                }
            }
        }
    }

    post {
        success {
            echo "✅ Analyse SonarQube réussie !"
        }
        failure {
            echo "❌ Échec de l'analyse"
        }
    }
}