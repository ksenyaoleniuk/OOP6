package Flowers.payment;

import java.util.Random;


public class CreditCardPaymentStrategy implements IPayment {
    public boolean pay(double price){
        Random rndGenerator = new Random();
        boolean [] newLst = {true, false};
        return newLst[rndGenerator.nextInt(1)];

    }
}
