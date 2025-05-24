def call(String url,String branch){
  echo "Starting cloning"
  git url: "${url}", branch: "${branch}"
  echo "Ho gaya"
}
