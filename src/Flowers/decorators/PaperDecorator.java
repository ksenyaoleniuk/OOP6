package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;


public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item){
        super(item);
    }
    public double getTotalPrice(){
        return (10 + getItem().getTotalPrice());
    }
    public String getDescription(){
        return item.getDescription();
    }
}
