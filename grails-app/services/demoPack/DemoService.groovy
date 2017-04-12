package demoPack

import auth.Role
import auth.User
import auth.UserRole
import grails.transaction.Transactional

@Transactional
class DemoService {

    def serviceMethod() {

    }

    def saveUserInfo(UserInfo userInfo){
        userInfo.save(flush: true,failOnError: true)

    }

    /**
     *
     * @return
     */
    def initUsers(){
        def adminRole=Role.findByAuthority('ROLE_ADMIN')?:new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole= Role.findByAuthority('ROLE_USER')?:new Role(authority: 'ROLE_USER').save(flush: true)

        def adminUser=User.findByUsername('admin')?:new User(username: 'admin',password: 'admin',enabled: true).save(flush: true)
        def user=User.findByUsername('user')?:new User(username: 'user',password: 'user',enabled: true).save(flush: true)

        if(!adminUser.authorities.contains('ROLE_ADMIN')){
            UserRole.create(adminUser,adminRole)
        }
        if(!user.authorities.contains('ROLE_USER')){
            UserRole.create(user,userRole)
        }


    }

    def getStatus(){
       /* def loggedInuser
        def dd=User.findByuserid(loggedInuser)*/
        return true
    }
}
