package Flowers.observers;

import Flowers.Observer;
import Flowers.parent.Item;

import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class ChamomillineSupplier extends Observer {
    public void update(Observable ob){
    }

    @Override
    void update() {
        System.out.println("update chamomil");
    }
}
