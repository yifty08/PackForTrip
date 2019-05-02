package com.company;

public class Jacket {
    private String color, material, length;

    public Jacket() {

    }

    public Jacket(String color, String material, String length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}