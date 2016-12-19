package Flowers;

import Flowers.delivery.IDelivery;
import Flowers.parent.Item;
import Flowers.payment.IPayment;

import java.util.LinkedList;
import java.util.Observable;

import Flowers.MyObservable;

/**
 * Created by olenyuk on 21.11.2016.
 */
public class Order implements MyObservable{
    LinkedList<Item>  linkedlist = new LinkedList<Item>();
    IPayment payment;
    IDelivery delivery;
    LinkedList<Observer> observers = new LinkedList<Observer>();
    public void Order(){}
    public void attach(Observer ob){
        observers.add(ob);
    }
    public void notifyAllObservers(){
        for (Observer obser:observers){
            obser.update(linkedlist);
        }
    }
    public void setPaymentStrategy(IPayment ip){
        this.payment = ip;
    };
    public void setDeliveryStrategy(IDelivery id){
        this.delivery = id;
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
    public double getTotalPrice(){
        int getPrice = 0;
        for (Item item: linkedlist){
            getPrice += item.price();
        }
    return getPrice;

    }
}
