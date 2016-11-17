package Flowers.payment;
import java.util.Random;

/**
 * Created by dzvinka on 07.11.16.
 */
public class PayPalPaymentStrategy implements IPayment {
    public boolean pay(double price){
        Random rndGenerator = new Random();
        boolean [] newLst = {true, false};
        return newLst[rndGenerator.nextInt(1)];

    }
}
