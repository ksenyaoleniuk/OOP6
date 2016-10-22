package Flowers;

/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public enum FlowerType {
    ROMASHKA, MAK, ROSA, TULPAN;

    public String toString(){
        switch (this){
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "mak";
            case ROSA:
                return "rosa";
            case TULPAN:
                return "tulpan";
            default:
                return "no color";
        }
    }
}
