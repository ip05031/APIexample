package com.magnaperitia.sicog.devices.weighing.service.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.magnaperitia.sicog.devices.weighing.domain.model.CustomUserDetail;
import com.magnaperitia.sicog.devices.weighing.domain.model.User;
import com.magnaperitia.sicog.devices.weighing.domain.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByUsername(name);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Wrong username or password!"));

        UserDetails userDetails = new CustomUserDetail(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;

    }
    
}