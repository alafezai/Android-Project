package com.example.projetintegration;

public class Product {

    String description;
    double price;
    Integer image;
    public  String getDescription(){
        return this.description;
    }
    public  double getPrice(){
        return  this.price;
    }
    public Integer getImage(){
        return  this.image;
    }

    public  void  setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(Integer image) {
        this.image = image;
    }


    public Product(String description, double price,Integer image){
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String toString(){
        return ""+this.price;
    }
}
