package demoPack

import groovy.sql.Sql

class LoginController {
    def demoService
    def index() {
        def userList=UserInfo.findAll()
        [userList:userList]
    }
    def saveUserInfoMethod(){
        try{
            println 'asdas'
            def user=new UserInfo()
            user.setName('asAAAAAd')
            user.setAddress('asdsa')
            demoService.saveUserInfo(user)
            println 'safdsaf'
            flash.message='success dfgfdg'
        }catch (Exception e){
            e.printStackTrace()
        }

        redirect(action: 'index')
    }
    def auth(){

    }

    def infoPage(){

    }
}
