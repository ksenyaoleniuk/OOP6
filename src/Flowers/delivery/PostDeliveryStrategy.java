package Flowers.delivery;
import Flowers.parent.Item;
import java.util.ArrayList;
import java.util.Random;


public class PostDeliveryStrategy implements IDelivery {
    public boolean deliver(ArrayList<Item> items) {
        Random rndGenerator = new Random();
        boolean[] newLst = {true, false};
        return newLst[rndGenerator.nextInt(1)];
    }

}