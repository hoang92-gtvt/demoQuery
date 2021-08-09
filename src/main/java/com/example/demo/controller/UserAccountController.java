package com.example.demo.controller;

import com.example.demo.dto.request.RegisterAccountRequest;
import com.example.demo.dto.response.MessageRespone;
import com.example.demo.model.UserAccount;
import com.example.demo.service.userAcc.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/account")
public class UserAccountController {
    @Autowired
    UserAccountService userAccountService;

    @PostMapping("/create")
        public ResponseEntity<?> createAccount(@RequestBody RegisterAccountRequest registerAccountRequest){
        userAccountService.saveAccount(registerAccountRequest);
        return new ResponseEntity<>(new MessageRespone("Ok"), HttpStatus.CREATED);

    }
    @GetMapping("/findAll")
    public ResponseEntity<?> getAllAccount(){
         List<UserAccount> users = (List<UserAccount>) userAccountService.findAll();
        if(users.isEmpty()){
            return new ResponseEntity<>(new MessageRespone("fail"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
    }
}
