package com.ivilla.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ivilla.example.model.User;
import com.ivilla.example.service.UserService;


@RestController
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping(value="/login", method=RequestMethod.POST)
    public User login(@RequestParam("user") String user,
                      @RequestParam("password") String password){
        return userService.getUser(user, password);
    }

	@RequestMapping(value="/hello", method=RequestMethod.GET)
   public String hello (){
        return "Hello world";
   }
   
}
