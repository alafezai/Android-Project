package com.example.projetintegration;

public class ProductModel {


    String name;
    int rating;
    String description;
    double price;
    String image;


    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public  String getDescription(){
        return this.description;
    }
    public  double getPrice(){
        return  this.price;
    }
    public String getImage(){
        return  this.image;
    }

    public  void  setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public ProductModel(String description, double price, String image,String name,int rating){
        this.description = description;
        this.price = price;
        this.image = image;
        this.name = name;
        this.rating = rating;
    }

    public String toString(){
        return ""+this.price;
    }
}
