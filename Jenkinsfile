pipeline{
	agent any 
	stages{
		stage('Compilar'){ 
			steps { 
				script {
					sh 'pwd'
					sh 'export JAVA_HOME=/usr/lib/jvm/java-1.15.0-openjdk-amd64'
					sh 'export PATH=$PATH:$JAVA_HOME/bin'
					sh 'echo $PATH'
					sh 'mvn package'
				}
				echo 'Compilacion finalizada exitosamente'
			} 
		}
	}
}
