pipeline {
    //agent any
    agent {
        docker {  image 'maven:3.9-amazoncorretto-21-debian' 
		          args '-v $HOME/.m2:/root/.m2'
				}
     }
	environment{
		docker_image_name='didierdefrance69/mini_spring_app:1'
	}
    stages {
	    //stage('from_git') {
        //    steps {
        //          git url : 'https://github.com/didier-tp/mini_spring_app' , branch : 'main'
        //    }
        //}
        stage('mvn_clean_package_skip_test') {
            steps {
				echo 'mvn clean package '
				sh 'mvn clean package -Dmaven.test.skip=true'
            }
        }
		stage('mvn test') {
            steps {
				echo 'mvn test'
				sh 'mvn test'
            }
        }
		stage('build_docker_image') {
			steps {
            //with Pipeline docker plugin:
			  script{
				    echo "docker_image_name=" + docker_image_name
					dockerImage = docker.build(docker_image_name)
				  }
			   }
        }
    }
}
