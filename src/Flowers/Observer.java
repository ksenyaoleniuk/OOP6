package Flowers;


/**
 * Created by olenyuk on 21.11.2016.
 */
public abstract class Observer{
    public MyObservable subject;
    public abstract void update(Object objects);

}
