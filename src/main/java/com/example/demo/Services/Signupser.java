package com.example.demo.Services;

import com.example.demo.Model.Signup;
import com.example.demo.Repositary.SignupRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Signupser {
    @Autowired
    SignupRespo serv;

    public List<Signup> details(){
        return serv.findAll();
    }
}
