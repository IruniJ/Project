package com.application.development.backendEDUCA.controller;

import com.application.development.backendEDUCA.dto.LoginRQ;
import com.application.development.backendEDUCA.dto.UserDTO;
import com.application.development.backendEDUCA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getLoggedUser",method = RequestMethod.POST)
    public ResponseEntity<UserDTO>getLoggedUser(@RequestBody LoginRQ loginRQ){

       UserDTO userDTO= this.userService.getLoggedUser(loginRQ);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
