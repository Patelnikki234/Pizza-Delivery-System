package com.example.springboot.controller;

import com.example.springboot.entity.PizzaDetail;
import com.example.springboot.service.MyInterface;
import com.example.springboot.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pizza")

public class PizzaController {
    @Autowired
    MyInterface objMyInterface;

    @PostMapping("/addPizza")
    public ResponseEntity<String> addPizza(@RequestBody PizzaDetail pizzaDetail)
    {
        boolean result = objMyInterface.addPizza(pizzaDetail);
        if (result)
        {
            return new ResponseEntity<String>("Successfully inserted", HttpStatus.OK);

        }
        else
        {
           return new ResponseEntity<String>("not inserted",HttpStatus.NOT_FOUND);
        }


    }
    @PutMapping("/updatePizza/{id}")
public String updatePizza(@RequestBody PizzaDetail pizzaDetail,@PathVariable("id") int id)
    {
       return objMyInterface.updatePizza(pizzaDetail,id);

    }

    @DeleteMapping("/delete/{id}")
    public String deletePizza(@PathVariable("id") int id)
    {
        return objMyInterface.delete(id);
    }

}

