package Flowers;

import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {

        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColor.BLACK, 12, true, 12.5, FlowerType.ROSA);
        Flower romashka = new Flower(FlowerColor.GREEN, 12, true, 12, FlowerType.TULPAN);

        FlowerSpec findFlower = new FlowerSpec(FlowerColor.GREEN, 12.0, FlowerType.TULPAN);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);

        System.out.println(bucket.getFlower(findFlower));
        System.out.println(bucket.searchFlower(findFlower));
    }
}


