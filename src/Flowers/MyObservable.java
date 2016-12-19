package Flowers;


import java.util.LinkedList;

/**
 * Created by olenyuk on 21.11.2016.
 */
public interface MyObservable{

public void attach(Observer observer);
public void notifyAllObservers();}