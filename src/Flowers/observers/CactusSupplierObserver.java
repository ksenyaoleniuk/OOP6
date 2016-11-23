package Flowers.observers;

import Flowers.Observer;

import java.util.Observable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class CactusSupplierObserver extends Observer {
    public CactusSupplierObserver(Observable subject){;
    }

    @Override
    void update() {
        System.out.println("update cactus");
    }
}
