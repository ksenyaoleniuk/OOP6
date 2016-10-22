package Flowers;

/**
 * Created by olenyuk on 17.10.2016.
 */
public class FlowerSpec {
    protected FlowerColor color;
    protected double length;
    protected FlowerType type;

    public FlowerSpec(FlowerColor color, double lenght, FlowerType type){
        this.color = color;
        this.length = lenght;
        this.type = type;

    }
    public FlowerType getType() {
        return type;
    }
    public double getLength(){
        return length;

    }
    public FlowerColor getColor(){
        return color;
    }

}

