package com.example.demoapi2.security.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoapi2.models.User;
import com.example.demoapi2.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService  {
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public  UserDetails loadUserByUsername(String username){
        User user = userRepository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User Not Found !!!"));

        return UserDetailsImpl.build(user);
    }
}
