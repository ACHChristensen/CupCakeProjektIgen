package CupCakeProjekt.Backend.domain.Repositories;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCakeFactory;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;

import java.util.ArrayList;
import java.util.List;

public interface CupCakeRepository extends CupCakeFactory {

    private static void deleteCupCake(CupCake cupCake){}

    static List<Bottom> showBottoms(){
        List<Bottom> bottoms = new ArrayList();
        return bottoms;
    }

    static List<Topping> showToppings(){
        List<Topping> toppings = new ArrayList();
        return toppings;
    }

    Topping createTop(String flavor);

    Bottom createBottom(String flavor);

    CupCake createCupCake(Topping top, Bottom bot);

}
