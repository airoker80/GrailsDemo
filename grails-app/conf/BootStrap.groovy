import demoPack.AdminController
import demoPack.LoginController

class BootStrap {
    def demoService

    def init = { servletContext ->

        demoService.initUsers()
    }
    def destroy = {
    }
}
