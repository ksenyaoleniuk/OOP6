package Flowers.fast_orders;

import Flowers.FlowerBucket;
import Flowers.Rose;
import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
import Flowers.specs.FlowerSpec;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class WeddingBucket extends FlowerBucket {
    public WeddingBucket(){
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));

        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
        addFlower(new Rose(new FlowerSpec(FlowerColour.PINK, 20, FlowerType.ROSE, FlowerSmell.SWEET) , 100));
    }
}
