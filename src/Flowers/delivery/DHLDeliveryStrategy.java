package Flowers.delivery;
import java.util.LinkedList;
import Flowers.parent.Item;


public class DHLDeliveryStrategy implements IDelivery {
    @Override
    public boolean deliver(LinkedList<Item> items) {
        if (items.size() != 0) {
            System.out.println("Sending order by DHL");
            for (Item item : items) {
                item.getDescription();

            }
            return true;
        }
        return false;
    }}
