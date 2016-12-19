package Flowers.observers;

import Flowers.FlowerBucket;
import Flowers.MyObservable;

import Flowers.Observer;
import Flowers.parent.Item;
import Flowers.parent.Specs;

import java.util.ArrayList;


/**
 * Created by olenyuk on 21.11.2016.
 */
public class CactusSupplierObserver extends Observer{
    private MyObservable subject;
    public CactusSupplierObserver(MyObservable subject){
        this.subject = subject;
    }

    @Override
    public void update(Object ob){
        int counter;
        for (Item item: (ArrayList<Item>) ob){
            numFlowers += ((FlowerBucket) item).searchFlower(specs).size()
        }
    } {
        System.out.println("update cactus");
    }
}
