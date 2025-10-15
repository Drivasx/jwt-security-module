package com.davidrivas.todolist.service;

import com.davidrivas.todolist.dto.LoginUserDto;
import com.davidrivas.todolist.dto.RegisterUserDto;
import com.davidrivas.todolist.entity.User;
import com.davidrivas.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;


    public User signUp(RegisterUserDto register){
        User user = new User();
        user.setName(register.getName());
        user.setEmail(register.getEmail());
        user.setPassword(passwordEncoder.encode(register.getPassword()));
        return userRepository.save(user);
    }

    public User authenticate(LoginUserDto login){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));

        return userRepository.findByEmail(login.getEmail()).orElseThrow();
    }
}
