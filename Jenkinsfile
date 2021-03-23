pipeline{
	agent any 
	stages{
		stage('Compilar'){ 
			steps { 
				script {
					sh 'pwd'
					sh 'mvn package'
				}
				echo 'Compilacion finalizada exitosamente'
			} 
		}
		stage('Analisis'){
			steps{
				script{
					scannerHome = tool 'sonarQubeScanner'
				}
				withSonarQubeEnv('sonaServer'){
					sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=test2 -Dsonar.projectVersion=1.0 -Dsonar.sources=./src -Dsonar.java.binaries=./target/classes -Dsonar.login=d0a2ab8ac86e73a2984ed04b9118ef3691250fd9"
				}
			}
		}
	}
}
