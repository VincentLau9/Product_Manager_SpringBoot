/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javacode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;

    public Product() {
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
     public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMadein() {
        return madein;
    }

    public float getPrice() {
        return price;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   
    
}
