package com.company;

public class Footwear {
    private String typeOfFootware;
    private double sizeOfShoe;
    private String color;

    public Footwear() {
    }

    public Footwear(String typeOfFootware, double sizeOfShoe, String color) {
        this.typeOfFootware = typeOfFootware;
        this.sizeOfShoe = sizeOfShoe;
        this.color = color;
    }

    public String getTypeOfFootware() {
        return typeOfFootware;
    }

    public void setTypeOfFootware(String typeOfFootware) {
        this.typeOfFootware = typeOfFootware;
    }

    public double getSizeOfShoe() {
        return sizeOfShoe;
    }

    public void setSizeOfShoe(double sizeOfShoe) {
        this.sizeOfShoe = sizeOfShoe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
