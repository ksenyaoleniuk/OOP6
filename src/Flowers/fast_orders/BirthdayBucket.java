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
public class BirthdayBucket extends FlowerBucket{
    public BirthdayBucket(){
        addFlower(new Rose(new FlowerSpec(FlowerColour.GREEN, 20, FlowerSmell.GOOD), 20));
        addFlower(new Rose(new FlowerSpec(FlowerColour.GREEN, 20, FlowerSmell.GOOD), 20));
        addFlower(new Rose(new FlowerSpec(FlowerColour.GREEN, 20, FlowerSmell.GOOD), 20));
        addFlower(new Rose(new FlowerSpec(FlowerColour.GREEN, 20, FlowerSmell.GOOD), 20));
        addFlower(new Rose(new FlowerSpec(FlowerColour.GREEN, 20, FlowerSmell.GOOD), 20));

    }}
