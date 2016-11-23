package Flowers.observers;

import Flowers.MyObservable;
import Flowers.Observer;

import java.util.Observable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class RomashkaSupplierObserver extends Observer {
    public RomashkaSupplierObserver(MyObservable subject) {
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Update romashka");

    }
}
