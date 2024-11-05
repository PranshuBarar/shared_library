def call(String imageName){
	echo "Deploying docker container with image named: ${imageName}"
	sh "docker build -t ${imageName} ."
}