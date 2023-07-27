package com.sky.animals;

import com.sky.Animal;

public abstract class Amphibian extends Animal {

    private boolean isSwimming;
    private double salary;
    public Amphibian(){
        super();
        salary = 0.0;
        isSwimming = false;
    }

    public Amphibian(int height, int weight, int age){
        super(height, weight, age);
        isSwimming = false;
        this.salary = 0;
    }

    public void swim(){
        this.isSwimming = !this.isSwimming;
    }

    public double getSalary(){
        return this.salary;
    }

    public boolean getSwimming(){
        return this.isSwimming;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
