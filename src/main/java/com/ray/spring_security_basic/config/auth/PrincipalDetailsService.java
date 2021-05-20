package com.ray.spring_security_basic.config.auth;

import com.ray.spring_security_basic.model.User;
import com.ray.spring_security_basic.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


// login요청이 들어오면 자동으로 UserDetailsService 타입으로 IoC되어 있는 loadUserByUsername 실행
@Service
public class PrincipalDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User userEntity = userRepository.findbyUsername(username);
        
        if (userEntity != null) {
            return new PrincipalDetails(userEntity);
        }
        return null;
    }
    
}
