package Flowers;

import Flowers.enums.FlowerColour;
import Flowers.parent.Flower;

/**
 * Created by olenyuk on 15.11.2016.
 */
public class Chamomille extends Flower {
    public int numberOfPetals;
    public Chamomille(int fresheness, int height, FlowerColour colour, double price, int cNumberOfPetals){
        super(fresheness, height, colour, price);
        numberOfPetals = cNumberOfPetals;

    }

}
