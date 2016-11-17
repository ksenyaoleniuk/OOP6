package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;


public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item){
        super(item);
    }
    public double getTotalPrice(){
        return (5 + getItem().getTotalPrice());
    }
    public String getDescription(){
        return item.getDescription();
    }
}