def gv

pipeline {
    agent any
    parameters{
        coice(name: 'VERSION', choices:['1.11.0', '1.2.0', '1.3.0'], dexription: '')
        booleanParam(name: 'executeTest', defaultValue: true, description: '')
    }
    stages {
        stage("Build") {
            steps {
                echo 'Building..'
                sh "mvn --version"
                
            }
        }
        
        stage("Test") {
            when{
                expression{
                   parmams.executeTest
                }
            }
        }
        steps {
            echo 'Testing..'
        }
        stage("deploy") {
            steps {
                echo 'Deploying..'
                echo "Deploying version ${params.VERSION}"
                
            }
        }
    }
}