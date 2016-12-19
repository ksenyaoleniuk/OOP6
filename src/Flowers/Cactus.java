package Flowers;

import Flowers.enums.CactusForm;
import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerType;
import Flowers.parent.Flower;
import Flowers.parent.Specs;
import Flowers.specs.CactusSpec;

/**
 * Created by olenyuk on 24.10.2016.
 */
public class Cactus extends Flower {
    String type = "Cactus";
    public Cactus(Specs specs, int fresheness) {
        super(specs, fresheness);
    }
    public CactusSpec getCactusSpec(){
        return (CactusSpec) specs;}
    public float getTotalPrice(){
        CactusForm form = getCactusSpec().getCatype();
        if (form == CactusForm.SUPERCOOL){
            return getCactusSpec().getLength() * 2.0f + 100; }
        else if (form == CactusForm.BIG){
            return getCactusSpec().getLength() * 2.0f + 50;

        }
        else{
            return 200.0f;
        }
    }
    public String getType(){
        return type;
    }
}
