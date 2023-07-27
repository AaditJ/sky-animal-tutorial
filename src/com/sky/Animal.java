package com.sky;
public abstract class Animal {
    private int weight;
    private int height;
    private int age;

    private WorldLocation location;
    public Animal(){
        this.height = 0;
        this.weight = 0;
        this.age = 0;
        this.location = new WorldLocation();
    }
    public Animal(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    };

    public int getAge(){
        return this.age;
    }

    public void grow(){
        setAge(getAge()+1);
        setHeight(getHeight()+1);
    }

    public void eat(){
        setWeight(getWeight() +1);
    }

    @Override
    public String toString(){
        return "Animal{" +
                "Age: " + getAge() +
                ", Height: " + getHeight() +
                ", Weight: " + getWeight() +
                "}";
    }
    @Override
    public boolean equals(Object o){
        if (o == null){
            return false;
        }

        if (o.getClass() != this.getClass()){
            return false;
        }

        final Animal obj = (Animal) o;
        if (getAge() != obj.getAge() || (getHeight() != obj.getHeight()) || (getWeight() != obj.getWeight())){
            return false;
        }
        return true;
    }
}
