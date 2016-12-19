package Flowers;

import Flowers.enums.FlowerSmell;
import Flowers.parent.Flower;
import Flowers.parent.Specs;
import Flowers.specs.FlowerSpec;

/**
 * Created by olenyuk on 19.12.2016.
 */
public class Rose extends Flower {
    String type = "ROSE";
    public Rose(Specs specs, int freshness){
        super(specs, freshness);
    }
    public FlowerSpec getFlowerSpec(){
        return (FlowerSpec) specs;
    }
        public float getTotalPrice(){
        FlowerSmell smell = getFlowerSpec().getSmell();
        int lenght = getFlowerSpec().getLength();

        if (smell == FlowerSmell.SWEET){
            return lenght * 3.0f + 30;}
        else{
            return lenght * 3.0f + 10;}
    }
    public String getTYpe(){
        return type;
    }

}
