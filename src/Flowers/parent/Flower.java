package Flowers.parent;

import Flowers.enums.FlowerColour;

/**
 * Created by matt on 10/3/16.
 */

public class Flower {
    protected Specs spec;
    private double price;
    private int freshness;
    private int height;
    private boolean suitable = true;
    public Flower( int fresheness, int height, FlowerColour colour, double price){
        this.price = price;
        this.freshness = fresheness;
        this.spec = new Specs(colour, height);

    }
    public FlowerColour getColour(){
        return spec.colour;    }
    public int getLenght(){
        return spec.height;
    }
    public double getPrice(){
        return price;

    }
    public int getFreshness(){
        return freshness;

    }
    public boolean isSuitable(){
        return suitable;

    }
    public void setSuitable( boolean suits){
        suitable = suits;

    }


}


