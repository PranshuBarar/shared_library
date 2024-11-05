def call(String imageName){
	echo "Deploying docker container with image named: ${imageName}"
	sh "docker run -p 8081:8081 ${imageName}"
}