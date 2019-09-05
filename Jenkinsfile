@Library('JenkinsSharedLib@remedy_test') _

node ('PROD-LIN7'){
    stage ("clone"){
        cleanWs()
        sh "git clone https://globalrepository.int/remedy.git”
    }
    stage ("createCRQ"){
       def create= new createRemedyCRQ()
       def CRQ = create.createCRQ("remedy-automation/crq_template_mtf.json")
  
    }
}