package com.ivilla.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ivilla.example.model.User;
import com.ivilla.example.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User getUser(){
      try{
        //logger.debug("....... Getting User from: [ " + startDate + " ] to: [ " + endDate + " ]" );
        User user = new User("ivilla", "qwerty");
        return user;
        
      } catch(Exception e) {
        e.printStackTrace();
        return null;
      }
    }

}
