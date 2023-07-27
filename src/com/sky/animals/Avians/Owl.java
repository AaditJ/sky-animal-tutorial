package com.sky.animals.Avians;

import com.sky.animals.Avian;

public class Owl extends Avian {
    public Owl(){
        super(10,10,1, 5.0f);
    }

    public void hoot(){
        System.out.println("Twwit twooo!");
    }
}