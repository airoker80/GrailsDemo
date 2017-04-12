package demoPack

import grails.plugin.springsecurity.annotation.Secured

class AdminController {

    def index() { }

    @Secured(['ROLE_ADMIN'])
    def dashboard(){

    }
}
