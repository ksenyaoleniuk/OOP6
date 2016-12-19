package Flowers.specs;
import Flowers.enums.CactusForm;
import Flowers.enums.FlowerColour;
import Flowers.enums.FlowerSmell;
import Flowers.parent.Specs;

/**
 * Created by dzvinka on 24.10.16.
 */
public class CactusSpec extends Specs {
    CactusForm  catype;
    public CactusSpec(int height,CactusForm catype) {
        super(FlowerColour.GREEN, height, FlowerSmell.NOSMELL);
    }
    public CactusForm getCatype(){
        return catype;
    }
}


