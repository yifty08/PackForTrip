package com.company;

public class Footwear {
    private String typeOfFootware;
    private String sizeOfShoe;
    private String color;

    public Footwear() {
    }

    public Footwear(String typeOfFootware, String sizeOfShoe, String color) {
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

    public String getSizeOfShoe() {
        return sizeOfShoe;
    }

    public void setSizeOfShoe(String sizeOfShoe) {
        this.sizeOfShoe = sizeOfShoe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String thisShoe(){
        String TempFootware = typeOfFootware;
        String TempSizeofShoe = sizeOfShoe;
        String TempColor = color;


        return "A " + TempColor + " " + TempFootware  +  " size "+ TempSizeofShoe;
    }

}
