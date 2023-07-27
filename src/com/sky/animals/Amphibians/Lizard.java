package com.sky.animals.Amphibians;

import com.sky.animals.Amphibian;

public abstract class Lizard extends Amphibian {
    public double salary;

    public Lizard(int height, int weight, int age, int salary) {
        super(height, weight, age);
        this.salary = salary;
    }
    public void Swim(){
        System.out.println("Swimming...");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
