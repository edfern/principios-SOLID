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
					sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=testNumber1 -Dsonar.projectVersion=1.0 -Dsonar.sources=. -Dsonar.login=e3dc282d596dbdfbf622302bfda377a28143a4b6"
				}
			}
		}
	}
}
