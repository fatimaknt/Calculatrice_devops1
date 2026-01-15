pipeline {
    agent any

    tools {
        maven "maven-3.9.12"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/fatimaknt/Calculatrice_devops1.git'
            }
        }

        stage('Build & Analyze') {
            steps {
                sh """
                    mvn clean package sonar:sonar \
                    -Dsonar.projectKey=calculatrice1 \
                    -Dsonar.projectName=Calculatrice \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.login=sqa_c564e09b5c01359364ceb93d31bcdaa53f426705
                """
            }
        }

        stage('Verify JAR') {
            steps {
                sh '''
                    echo "=== Vérification du JAR généré ==="
                    ls -lh target/JUnitTutoTest-1.0-SNAPSHOT.jar
                    echo "=== Taille ==="
                    du -h target/JUnitTutoTest-1.0-SNAPSHOT.jar
                    echo "=== Contenu ==="
                    jar tf target/JUnitTutoTest-1.0-SNAPSHOT.jar | head -10
                '''
            }
        }
    }

    post {
        success {
            // Archive le JAR spécifique
            archiveArtifacts artifacts: 'target/JUnitTutoTest-1.0-SNAPSHOT.jar', fingerprint: true, allowEmptyArchive: true

            // OU pour archiver tous les JARs
            // archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, allowEmptyArchive: true

            echo "✅ JAR archivé avec succès : JUnitTutoTest-1.0-SNAPSHOT.jar"
        }
    }
}