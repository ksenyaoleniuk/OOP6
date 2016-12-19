package Flowers.specs;

import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.enums.FlowerType;
import Flowers.parent.Specs;

/**
 * Created by olenyuk on 19.12.2016.
 */
public class FlowerSpec extends Specs {
    String type;
    public FlowerSpec(FlowerColour colour, int height, FlowerSmell smell) {
        super(colour, height,smell);
        this.type = "ROSE";
    }
    public String getType(){
        return "ROSE";
    }

}
