package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item){
        super(item);
    }
    public int price(){
        return (300 + getItem().price());
    }
    public String getDescription(){
        return item.getDescription();
    }
    }
