package Flowers;

import Flowers.fast_orders.BirthdayBucket;
import Flowers.fast_orders.WeddingBucket;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class Store {
    public Object getOrder(String type){
        if (type.equals("Wedding")){
            return new WeddingBucket();}
        if (type.equals("Birthday")) {
            return new BirthdayBucket();
        }
        if (type.equals("Funeral")){
            return new FuneralBucket();
        }
        return null;
        }
    }
