package authSuccess
/**
 * Created by ratan on 9/16/15.
 */
import grails.plugin.springsecurity.SpringSecurityUtils
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
class MyAuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    protected String determineTargetUrl(HttpServletRequest request,
                                        HttpServletResponse response) {
        boolean hasAdmin= SpringSecurityUtils.ifAllGranted("ROLE_ADMIN");
        boolean hasUser= SpringSecurityUtils.ifAllGranted("ROLE_USER");

        if(hasAdmin){
            return adminUrl
        }else if(hasUser){
            return userUrl;
        }
        else{
            return super.determineTargetUrl(request, response);
        }
    }


    private String adminUrl
    private String userUrl
   
    void setAdminUrl(String adminUrl) {
        this.adminUrl = adminUrl
    }

    public void setUserUrl(String userUrl){
        this.userUrl = userUrl
    }
}

