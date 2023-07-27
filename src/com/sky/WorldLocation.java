package com.sky;
import java.util.HashMap;

public class WorldLocation {
    private int x;
    private int y;

    private HashMap<String, int[]> countries;

    private Country country;

    WorldLocation(){
        this.x =0;
        this.y =0;
    }

    WorldLocation(int x, int y){
        this.x = x;
        this.y = y;

    }

    public void addCountry(String name, int[] location){
        countries.put(name, location);
    }

    public Country findLocation(){
        Country x = new Country();
        return x;
    }


}
