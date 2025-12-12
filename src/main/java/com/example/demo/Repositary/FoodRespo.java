package com.example.demo.Repositary;

import com.example.demo.Model.Fooditems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRespo extends JpaRepository<Fooditems, Integer> {

}
