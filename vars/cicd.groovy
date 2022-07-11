def newgit(repo)
{
  git "${repo}"
}
def newMaven()
{
 sh 'mvn package' 
} 
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '8c124f2c-c5a0-4a88-8fd3-1dff50e01602', path: '', url: "$(ip)")], contextPath: "${appname}", war: '**/*.war'
}
  
  
  
