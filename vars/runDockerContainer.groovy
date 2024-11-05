def call(String imageName){
	echo "Deploying docker container with image named: ${imageName}"
	sh "docker run ${imageName} -p 8081:8081"
}