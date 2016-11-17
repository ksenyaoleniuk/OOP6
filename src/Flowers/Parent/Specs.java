package Flowers.parent;
import Flowers.enums.FlowerColour;
public  class Specs {
    protected FlowerColour colour;
    protected int height;

    public Specs(FlowerColour colour, int height){
        this.height = height;
        this.colour = colour;
    }
    public int getLength(){
        return height;
    }
    public FlowerColour getColour(){
        return colour;
    }}





