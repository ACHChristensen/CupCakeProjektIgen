package CupCakeProjekt.Backend.domain.Repositories;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCakeFactory;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;

public interface CupCakeRepository extends CupCakeFactory {

    private static void deleteCupCake(CupCake cupCake){}

    Topping createTop(String flavor);

    Bottom createBottom(String flavor);

    CupCake createCupCake(Topping top, Bottom bot);

}
