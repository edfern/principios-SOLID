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
					sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=testNumber1 -Dsonar.projectVersion=1.0 -Dsonar.sources=. -Dsonar.java.binaries=./target/classes -Dsonar.login=cd6292b3998e86ca4c78028157974a59e188d17b"
				}
			}
		}
	}
}
