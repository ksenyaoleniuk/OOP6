package Flowers.delivery;
import Flowers.parent.Item;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class PostDeliveryStrategy implements IDelivery {
    public boolean deliver(LinkedList<Item> items) {
        if (items.size() != 0) {
            System.out.println("Sending order by post");
            for (Item item : items) {
                item.getDescription();

            }
            return true;
        }
        return false;}}