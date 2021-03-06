package Flowers;

import Flowers.enums.CactusForm;
import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
import Flowers.parent.Flower;
import Flowers.parent.Specs;
import Flowers.specs.CactusSpec;
import Flowers.specs.FlowerSpec;

/**
 * Created by olenyuk on 15.11.2016.
 */
public class Chamomille extends Flower {


    public Chamomille(Specs specs, int fresheness) {
        super(specs, fresheness);
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

    }



