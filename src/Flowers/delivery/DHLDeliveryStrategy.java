package Flowers.delivery;
import java.util.ArrayList;
import java.util.Random;
import Flowers.parent.Item;


public class DHLDeliveryStrategy implements IDelivery {
    public boolean deliver(ArrayList<Item> items) {
        Random rndGenerator = new Random();
        boolean[] newLst = {true, false};
        return newLst[rndGenerator.nextInt(1)];
    }
}
