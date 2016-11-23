package Flowers.delivery;

import Flowers.parent.Item;

import java.util.ArrayList;
import java.util.LinkedList;


public interface IDelivery {
    public boolean deliver(LinkedList<Item> items);

}
