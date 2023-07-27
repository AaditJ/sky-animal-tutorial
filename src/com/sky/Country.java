package com.sky;


public class Country {
    private int x;
    private int y;
    private String name;

    private int radius;
    public Country(){
        this.x = 0;
        this.y = 0;
        this.name = "";

    }

    public Country(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;

    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getRadius(){
        return this.radius;
    }

    public int[] getCoordinate(){
        int[] coordinate = new int[2];
        coordinate[0] = this.x;
        coordinate[1] = this.y;
        return coordinate;
    }
}
