def call(String ProjectName,String ImageTag, String DockerHubUser){
  sh "sudo docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
