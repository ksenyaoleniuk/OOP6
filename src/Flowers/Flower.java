package Flowers;


/**
 * Created by matt on 10/3/16.
 */
public class Flower {


//    protected FlowerSpec color;
//    protected double length;
    protected boolean fresh;
    protected double price;
    protected FlowerSpec spec;

    public Flower(FlowerColor color, double length, boolean fresh, double price, FlowerType type) {

        this.fresh = fresh;
        this.price = price;
        this.spec = new FlowerSpec(color, length, type);
    }

    public FlowerType getType() {
        return spec.getType();
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return spec.getLength();
    }
    public FlowerColor getColor() {
        return spec.getColor();
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }

}

