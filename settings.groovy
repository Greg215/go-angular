deployment_user = "ubuntu"

repo_url = "ssh://git@github.com:Greg215/go-angular.git"
empa_working_dir = "/home/ubuntu/empa"
empa_tmp_dir = "/tmp/empa"
def get_ecosystem(env){
  if (env.ecosystem == 'test_2017'){
      return 'test_2017.groovy'
  }else{
      if (env.ecosystem == 'test_2018'){
          return 'test_2018.groovy'
      }else{
        error 'Undefined ecosystem!'
      }
  }
}

return this;