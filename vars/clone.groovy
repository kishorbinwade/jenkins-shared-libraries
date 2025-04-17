def clone(String url,String branch){
  sh "clone is starting"
  sh "git url : ${url}, branch:${branch} "
  sh "clone is successful "
  sh"msg from git 'jenkins-shared-libraries/vars/clone.groovy' "
/

}
