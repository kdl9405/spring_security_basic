package com.ray.spring_security_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({ "", "/" })
    public String index() {
        return "index";
    }

       public String use
           return "user" ;
    }
    
    @GetMapping("/admin")
    public String admin()
           return "admin" ;
    }
    
    @GetMapping("/manager")
    public String manager()
           return "manager" ;
    }
    
    @GetMapping("/login")
    public String login()
           return "login" ;
    }
    
    @GetMapping("/join")
    public String join()
           return "join" ;
    }
    

