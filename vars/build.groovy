def call(String mavenGoal){
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Test")
  {
    sh "mvn test"
  }
  else if ("${mavenGoal}" == "Package")
  {
    sh "mvn package"
  }
}
    
