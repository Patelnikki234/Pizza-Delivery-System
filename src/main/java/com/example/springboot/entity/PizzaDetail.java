package com.example.springboot.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Pizza")
@Getter
@Setter

public class PizzaDetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;

    private String name;

    private String city;

    private String description;

    private String price;


}

