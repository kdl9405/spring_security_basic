package com.ray.spring_security_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

       @GetMapping({ "", "/" })
       public String index() {
              return "index";
       }

       @GetMapping("/user")
       public @ResponseBody String user() {
              return "user";
       }

       @GetMapping("/admin")
       public String admin() {
              return "admin";
       }

       @GetMapping("/manager")
       public @ResponseBody String manager() {
              return "manager";
       }

       @GetMapping("/login")
       public String login() {
              return "loginForm";
       }

       @GetMapping("/join")
       public String join() {
              return "join";
       }
       
       @GetMapping("/joinProc")
       public @ResponseBody String joinProc() {
              return "회원가입 완료";
       }
}
