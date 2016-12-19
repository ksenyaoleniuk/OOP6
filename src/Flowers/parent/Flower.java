package Flowers.parent;

import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;

/**
 * Created by matt on 10/3/16.
 */

public class Flower {
    public Specs specs;
    private int freshness;
    private boolean suitable = true;
    public Flower(Specs specs, int fresheness){
        this.freshness = fresheness;
        this.specs = specs;


    }
    public FlowerColour getColour(){
        return specs.colour;    }
    public int getLenght(){
        return specs.height;
    }
    public FlowerSmell getSmell(){
        return specs.smell;
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
    public Specs getSpecs(){
        return this.specs;
    }


}


