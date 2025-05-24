def call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "sudo docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "sudo docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
