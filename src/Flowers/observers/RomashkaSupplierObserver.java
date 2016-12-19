package Flowers.observers;

import Flowers.Observable;
import Flowers.Observer;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class RomashkaSupplierObserver extends Observer {
    public RomashkaSupplierObserver(Observable subject) {
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Update romashka");

    }
}
