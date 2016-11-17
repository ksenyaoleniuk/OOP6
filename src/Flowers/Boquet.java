package Flowers;
import Flowers.parent.Flower;
import java.util.ArrayList;

/**
 import java.util.ArrayList;
 import java.util.Arrays;


 */
class Boquet{
    public int size; 
    public ArrayList<Flower> flowers = new ArrayList<>();
    public Boquet(ArrayList<Flower> components) {
        for (Flower flows: components) {
            if (flows.isSuitable()) {
                flowers.add(flows);
                size++;
            }

        }
    }



    public void addFlower(Flower flows){
        if (flows.isSuitable()) {
            flowers.add(flows);
            size++;
        }else{
            System.out.println("Not suitable for the boquet");
        }

    }
    public void sortFlowers(){
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < flowers.size(); i++) {
                if (flowers.get(i - 1).getFreshness() < flowers.get(i).getFreshness()) {
                    Flower temp = flowers.get(i - 1);
                    flowers.set(i - 1, flowers.get(i));
                    flowers.set(i, temp);
                    isSorted = false;

                }
            }
        }
        while (!isSorted);

    }

    public Flower searchHeight(int h1, int h2){
        for (Flower item: flowers){
            if (item.getLenght() >= h1 && item.getLenght() <= h2){
                return item;
            }

        }
        return null;
    }

    public int getPrice(){
        int sum = 0;
        for (Flower item: flowers){
            sum += item.getPrice();
        }
        return sum;
    }
    public Flower getTheFreshest(){
        Flower freshest = flowers.get(0);
        for (Flower item: flowers)
            if (item.getFreshness() > freshest.getFreshness()){
                freshest = item;

            }
        return freshest;
    }



}