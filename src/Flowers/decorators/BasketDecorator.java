package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;


public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item){
        super(item);
    }
    public String getDescription(){
        return item.getDescription();
    }

    @Override
    public int price() {
        return (5 + getItem().price());
    }
}