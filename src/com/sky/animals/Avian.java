package com.sky.animals;

import com.sky.Animal;

public abstract class Avian extends Animal {
    private float wingspan;
    private boolean isFlying;
    public Avian(){
        super();
        this.wingspan = 10.0f;
    }

    public Avian(int height, int weight, int age, float wingspan){
        super(height, weight, age);
        this.wingspan = wingspan;
    }
    public void fly(){
        this.isFlying = !this.isFlying;
    }

    public float getWingspan(){
        return this.wingspan;
    }

    public boolean getFlying(){
        return this.isFlying;
    }
    public void setWingspan(float wingspan){
        this.wingspan = wingspan;
    }
}
