package Flowers;


/**
 * Created by olenyuk on 21.11.2016.
 */
public abstract class Observer{
    MyObservable subject;
    public abstract void update(Object obs);

}
