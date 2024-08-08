def call(String mavenGoal){
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  elseif ("${mavenGoal}" == "Test")
  {
    sh "mvn test"
  }
  elseif ("${mavenGoal}" == "Package")
  {
    sh "mvn package"
  }
}
    
