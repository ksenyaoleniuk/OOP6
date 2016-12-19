package Flowers;

import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
import Flowers.parent.Flower;
import Flowers.specs.FlowerSpec;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket myBuket  = new FlowerBucket();
        Rose roseFirst = new Rose(new FlowerSpec(FlowerColour.PINK, 30, FlowerSmell.SWEET), 20);


    }
}

