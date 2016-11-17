package Flowers;
/**
 * Created by matt on 10/3/16.
 */

import Flowers.parent.Flower;
import Flowers.parent.Item;
import Flowers.parent.Specs;
import java.util.ArrayList;

public class FlowerBucket implements Item {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method getLength()()
    private Flower[] a = new Flower[defaultSize];

    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }
    public String getDescription() {
        return toString();
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i ++) {
            sum += a[i].getPrice();
        }
        return sum;
    }
    public Flower[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLenght() <= end && a[i].getLenght() >= start) {
                tmpSize++;
            }
        }
        Flower[] tmpPart = new Flower[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLenght() <= end && a[i].getLenght() >= start) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex++;
            }
        }return tmpPart;
    }

    public Flower searchFlower(Flower flower){
        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getColour() != flower.getColour())
                continue;

            if (a[i].getLenght() != flower.getLenght())
                continue;
                return a[i];
            }

        return null;
    }
}