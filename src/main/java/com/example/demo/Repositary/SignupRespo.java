package com.example.demo.Repositary;

import com.example.demo.Model.Fooditems;
import com.example.demo.Model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRespo extends JpaRepository<Signup,Integer> {

}
