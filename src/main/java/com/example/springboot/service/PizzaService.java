package com.example.springboot.service;

import com.example.springboot.entity.PizzaDetail;
import com.example.springboot.repositary.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PizzaService implements MyInterface{
    @Autowired
    PizzaRepo pizzaRepo;

    public boolean addPizza(PizzaDetail pizzaDetail) {
        boolean result = false;
        PizzaDetail save = pizzaRepo.save(pizzaDetail);
        if (save != null) {
            result = true;
            return result;
        } else {
            return result;
        }
    }

    public String updatePizza(PizzaDetail pizzaDetail, int id) {
        boolean result = false;
        PizzaDetail pizzaDetail1 = pizzaRepo.findById(id).get();
        pizzaDetail1.setId(id);
        pizzaDetail1.setCity(pizzaDetail.getCity());
        pizzaDetail1.setName(pizzaDetail.getName());
        pizzaDetail1.setDescription(pizzaDetail.getDescription());
        pizzaDetail1.setPrice(pizzaDetail.getPrice());
        pizzaRepo.save(pizzaDetail1);
        return "Successfully updated";


    }

    public String delete(int id) {
        pizzaRepo.deleteById(id);
        return "Successfully deleted:"+id;
    }
}





