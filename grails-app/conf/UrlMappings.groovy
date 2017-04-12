import org.springframework.web.bind.annotation.RequestMapping

class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "/"(controller: 'login',action: 'auth')
        "500"(view:'/error')
	}
}
