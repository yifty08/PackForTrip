package com.company;

import java.util.ArrayList;

public class ClosetApp {

    public static void main(String[] args) {
        //Creating instances of the closet
        Closet work = new Closet();
        Closet play = new Closet();
        Closet vacation = new Closet();

        //Making an array List
        ArrayList<Closet> myCloset = new ArrayList<Closet>();

        myCloset.add(work);
        myCloset.add(play);
        myCloset.add(vacation);

        for(Closet temp:myCloset){

            //System.out.println();
        }



    }
}
