package Flowers;

import Flowers.delivery.IDelivery;
import Flowers.parent.Item;
import Flowers.payment.IPayment;

import java.util.*;
import java.util.Observable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class Order extends Observable{
    LinkedList<Item>  linkedlist;
    IPayment payment;
    IDelivery delivery;
    public void setPaymentStrategy(IPayment ip){
        payment = ip;
    };
    public void setDeliveryStrategy(IDelivery id){
        delivery = id;
}
    public double calculateTotalPrice(){
        double counter = 0.0;
        for(int i = 0; i < linkedlist.size(); i++){
            counter += linkedlist.get(i).price();
        }
        return counter;
    }
    public void processOred(){
        payment.pay(calculateTotalPrice());
        System.out.println(delivery.deliver(linkedlist));
    }
    public void addItem(Item item){
            linkedlist.add(item);
    }
    public void removeItem(Item item){
        linkedlist.remove(item);
    }
}
