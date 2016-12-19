package Flowers.observers;

import Flowers.FlowerBucket;
import Flowers.MyObservable;
import Flowers.Observer;
import Flowers.parent.Item;
import Flowers.parent.Specs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class ChamomillineSupplier extends Observer {
    protected Specs specs;
    public ChamomillineSupplier(MyObservable observable, Specs specs) {
        this.specs = specs;
        this.subject = observable;
    }
    @Override
    public void update(Object ob) {
        int numFlowers = 0;
        for (Item item: (ArrayList<Item>) ob) {
            numFlowers += ((FlowerBucket) item).searchFlower(specs).size();
        }
    }
}