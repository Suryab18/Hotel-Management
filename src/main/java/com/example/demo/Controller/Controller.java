package com.example.demo.Controller;


import com.example.demo.Model.Fooditems;
import com.example.demo.Services.Foodservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    Foodservices serve;

    @GetMapping
    public List<Fooditems> get_items(){
        return serve.get_product();
    }



}
