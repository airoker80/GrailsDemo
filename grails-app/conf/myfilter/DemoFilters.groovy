package myfilter

class DemoFilters {
    def springSecurityService
    def demoService
    def filters = {
        all(controller:'login', action:'*',invert:true) {
            before = {
                if(springSecurityService.isLoggedIn()){
                    def sts=demoService.getStatus()
                    if(!sts){
                        redirect(controller: 'login',action: 'infoPage')
                        return false
                    }
                }
            }
            after = { Map model ->
prti
            }
            afterView = { Exception e ->

            }
        }

    }
}
