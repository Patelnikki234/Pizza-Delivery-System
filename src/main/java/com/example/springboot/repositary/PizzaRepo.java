package com.example.springboot.repositary;

import com.example.springboot.entity.PizzaDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<PizzaDetail,Integer> {
}
