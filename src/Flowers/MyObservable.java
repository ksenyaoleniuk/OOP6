package Flowers;

import java.util.LinkedList;
import java.util.Observable;
/**
 * Created by olenyuk on 21.11.2016.
 */
public class MyObservable extends Observer {
    LinkedList<MyObservable> observables;
    public MyObservable(){

    }
    public MyObservable getState(){
        return this;
    }
    public void setState(){}
    public void attach(MyObservable ob){
        observables.add(ob);
    }
    public void notifyAllObservers(){

    }
}
