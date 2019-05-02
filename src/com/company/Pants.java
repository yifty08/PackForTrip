package com.company;

import javax.xml.soap.SAAJResult;

public class Pants {
    private String typeOfPants;
    private String color;
    private String size;

    public Pants() {
    }

    public Pants(String typeOfPants, String color, String size) {
        this.typeOfPants = typeOfPants;
        this.color = color;
        this.size = size;
    }

    public String getTypeOfPants() {
        return typeOfPants;
    }

    public void setTypeOfPants(String typeOfPants) {
        this.typeOfPants = typeOfPants;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
