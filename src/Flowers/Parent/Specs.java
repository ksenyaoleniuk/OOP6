package Flowers.parent;
import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
public  class Specs {
    protected FlowerColour colour;
    protected int height;
    protected FlowerType type;
    protected FlowerSmell smell;

    public Specs(FlowerColour colour, int height,FlowerType type, FlowerSmell smell){
        this.height = height;
        this.colour = colour;
        this.type = type;
        this.smell = smell;
    }

    public Specs(FlowerColour colour, int height, FlowerSmell smell) {
    }
    public FlowerSmell getSmell(){return smell;}
    public int getLength(){
        return height;
    }

    public FlowerColour getColour(){return colour;}

    public FlowerType getType(){return type;}

    public boolean match(Specs specs){
        if (specs.height != this.height){
            return false;
        }
        if (specs.colour != this.colour){
            return false;
        }
        if (specs.type != this.type){
            return false;
        }
        return true;
    }
}





