package com.company;

public class Shirt {
    private String material;
    private String color;

    public Shirt(){

    }

    public Shirt(String material,  String color) {

        this.material = material;
        this.color = color;
    }
    public void setMaterial (String material ){
        this.material = material;

    }
    public String getMaterial(){
        return material;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}