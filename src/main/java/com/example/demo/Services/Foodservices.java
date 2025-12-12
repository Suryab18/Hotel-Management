package com.example.demo.Services;

import com.example.demo.Model.Fooditems;
import com.example.demo.Repositary.FoodRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Foodservices {

        @Autowired
        FoodRespo ser;


        public List<Fooditems> get_product(){
            return ser.findAll();

        }


}
