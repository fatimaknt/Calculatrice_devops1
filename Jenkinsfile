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
                    sh "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=calculatrice1 -Dsonar.projectName=Calculatrice"
                }
            }
        }
    }
}
