package com.sky.animals;

import com.sky.Animal;

public abstract class Mammal extends Animal{
    private boolean isWalking;
    public Mammal(){
        super();

    }

    public Mammal(int height, int weight, int age){
        super(height, weight, age);
    }

    public void walk(){
        this.isWalking= !this.isWalking;
    }

    public boolean getWalking(){
        return this.isWalking;
    }
}
