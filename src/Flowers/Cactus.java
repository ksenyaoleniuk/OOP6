package Flowers;

import Flowers.enums.FlowerColour;
import Flowers.parent.Flower;
import Flowers.parent.Specs;

/**
 * Created by olenyuk on 24.10.2016.
 */
public class Cactus extends Flower {
    public boolean computerProtection;

    public Cactus(int fresheness, int height, FlowerColour colour, double price, boolean cComputerProtection) {

        super(fresheness, height, colour, price);
        computerProtection = cComputerProtection;
    }

    public boolean getCProtection() {
        return computerProtection;

    }
}