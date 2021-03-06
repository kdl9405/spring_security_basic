package com.ray.spring_security_basic.controller;

import com.ray.spring_security_basic.model.User;
import com.ray.spring_security_basic.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

       @Autowired
       private UserRepository userRepository;

       @Autowired
       private BCryptPasswordEncoder bCryptPasswordEncoder;

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

       @GetMapping("/loginForm")
       public String loginForm() {
              return "loginForm";
       }

       @GetMapping("/joinForm")
       public String joinFrom() {
              return "joinForm";
       }

       @PostMapping("/join")
       public String join(User user) {

              user.setRole("ROLE_USER");
              String rawPassword = user.getPassword();
              String encPassword = bCryptPasswordEncoder.encode(rawPassword);
              user.setPassword(encPassword);
       
              return "redirect:/loginForm";
       }

}
