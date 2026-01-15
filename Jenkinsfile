pipeline {
    agent any
    tools { maven "Default Maven" }

    stages {
        stage("SCM Checkout") { steps { checkout scm } }
        stage("Build & Tests") {
            steps { sh "mvn clean compile test" }
            post { success { junit "target/surefire-reports/*.xml" } }
        }
        stage("SonarQube Analysis") {
            steps { withSonarQubeEnv("SonarQube") {
                sh "mvn sonar:sonar -Dsonar.projectKey=calculatrice1 -Dsonar.projectName=Calculatrice"
            }}
        }
        stage("Quality Gate Check") {
            steps { timeout(time: 1, unit: "HOURS") { waitForQualityGate abortPipeline: true } }
        }
    }
    post { always { echo "Pipeline terminé" } }
}