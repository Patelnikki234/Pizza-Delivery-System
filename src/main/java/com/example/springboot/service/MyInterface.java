package com.example.springboot.service;

import com.example.springboot.entity.PizzaDetail;

public interface MyInterface
{
    public  boolean addPizza(PizzaDetail pizzaDetail);
    public String updatePizza(PizzaDetail pizzaDetail, int id);
    public String delete(int id);

}
