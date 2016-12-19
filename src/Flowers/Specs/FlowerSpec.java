package Flowers.specs;

import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
import Flowers.parent.Specs;

/**
 * Created by olenyuk on 19.12.2016.
 */
public class FlowerSpec extends Specs {
    public FlowerSpec(FlowerColour colour, int height, FlowerType type, FlowerSmell smell) {
        super(colour, height, type, smell);
    }

}
