package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item){
        super(item);
    }
    public double getTotalPrice(){
        return (30 + getItem().getTotalPrice());
    }
    public String getDescription(){
        return item.getDescription();
    }
}