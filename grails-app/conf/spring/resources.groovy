// Place your Spring DSL code here

import authSuccess.MyAuthSuccessHandler
import demoPack.AdminController
import grails.plugin.springsecurity.SpringSecurityUtils

beans = {

    authenticationSuccessHandler(MyAuthSuccessHandler) {

        def conf = SpringSecurityUtils.securityConfig
        requestCache = ref('requestCache')
        defaultTargetUrl = conf.successHandler.defaultTargetUrl
        alwaysUseDefaultTargetUrl = conf.successHandler.alwaysUseDefault
        targetUrlParameter = conf.successHandler.targetUrlParameter
        useReferer = conf.successHandler.useReferer
        redirectStrategy = ref('redirectStrategy')
        redirectStrategy = ref('redirectStrategy')
        adminUrl= '/admin/dashboard'
        userUrl = '/user/dashboard'

    }
}
