package Flowers;


import java.util.LinkedList;

/**
 * Created by olenyuk on 21.11.2016.
 */
public interface MyObservable{

        void attach(Observer observer);
        void notifyAllObservers();}