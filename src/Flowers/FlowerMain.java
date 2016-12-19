package Flowers;

import Flowers.enums.FlowerColour;
import Flowers.parent.Flower;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        ArrayList<Flower> flowers = new ArrayList<>(Arrays.asList(
                new Cactus(20, 1, FlowerColour.GREEN, 13,true),
                new Cactus(20, 2, FlowerColour.GREEN, 12, false),
                new Chamomille(15, 5, FlowerColour.RED, 20,20),
                new Chamomille(15, 3, FlowerColour.PINK, 21,21)

        ));
        Boquet myBouquet = new Boquet(flowers);
        Cactus cact1 = new Cactus(20, 3, FlowerColour.GREEN, 12,false);
        cact1.setSuitable(false);
        myBouquet.addFlower(cact1);
        System.out.println("Price " + myBouquet.getPrice());
        System.out.println(myBouquet.getTheFreshest());

        myBouquet.sortFlowers();
        System.out.println(myBouquet.flowers);
    }
}

