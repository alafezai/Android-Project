package com.example.projetintegration;

import android.widget.ImageView;
import android.widget.TextView;

public class productPanier {

    String price;
    String priceTotal;
    Integer image;
    String title;

    public String getPrice() {
        return price;
    }

    public String getPriceTotal() {
        return priceTotal;
    }

    public Integer getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPriceTotal(String priceTotal) {
        this.priceTotal = priceTotal;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public productPanier(String price, String priceTotal, Integer image, String title) {
        this.price = price;
        this.priceTotal = priceTotal;
        this.image = image;
        this.title = title;
    }
}
