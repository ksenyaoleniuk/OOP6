package Flowers.decorators;

import Flowers.parent.Item;
import Flowers.parent.ItemDecorator;


public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item){
        super(item);
    }
    public int price(){
        return (10 + getItem().price());
    }
    public String getDescription(){
        return item.getDescription();
    }
}
