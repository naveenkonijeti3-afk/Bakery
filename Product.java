package com.bakery.order.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="products") public class Product {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @Positive private double price;
 private String category;
 public Product(){} public Product(String name,double price,String category){this.name=name;this.price=price;this.category=category;}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String n){name=n;} public double getPrice(){return price;} public void setPrice(double p){price=p;} public String getCategory(){return category;} public void setCategory(String c){category=c;}
}
