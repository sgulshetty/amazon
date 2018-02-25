 pipeline{
       agent{
          label "windows"
         }
       tools {
            maven 'MAVEN_HOME'
            jdk 'JAVA_HOME'
         }
       stages {
           stage ('Initialize') {
              steps {
                bat '''
                   echo "PATH=%PATH"
                   echo "M2_HOME=%M2_HOME%"
                '''
               }
             }
            stage('Build'){
               steps {
                  bat- 'cd com.Amazon & mvn install'
             }
               post {
                 success {
                  junit 'com.Amazon/target/surefire-reports/*.xml'
                         }
                    }
              }
           }
        }
