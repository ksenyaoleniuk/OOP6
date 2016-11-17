package Flowers.specs;
import Flowers.enums.FlowerColour;
import Flowers.parent.Specs;
import Flowers.enums.CactusForm;
/**
 * Created by dzvinka on 24.10.16.
 */
public class CactusSpec extends Specs {
    public CactusForm getForm() {
        return form;
    }

    private CactusForm form;

    public CactusSpec(int height, CactusForm form) {

        super(FlowerColour.GREEN, height);
        this.form = form;
    }}

//    public boolean match(CactusSpec cspec) {
//        if (!super.match(cspec)) {
//            return false;
//        }
//        if (cspec.form != this.form){
//            return false;
//        }
//        return true;
//    }
//}
