package Flowers.parent;

public abstract class ItemDecorator implements Item{
    public Item getItem() {
        return item;
    }

    protected Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }


}