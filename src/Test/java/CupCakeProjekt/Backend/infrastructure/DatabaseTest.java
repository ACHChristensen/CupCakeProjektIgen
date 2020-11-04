package CupCakeProjekt.Backend.infrastructure;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import junit.framework.TestCase;

public class DatabaseTest extends TestCase {

    Database db;

    public void setUp() throws Exception {
        //arrange
        db = new Database();

    }

    public void testCreateTop_ByFlavorToString() {
        //act
        Topping top1 = db.createTop("Chocolate");
        Topping top2 = new Topping ("chocolate", 5.0);
        //assert
        assertEquals(top2.toString(), top1.toString());
    }

    public void testCreateBottom() {
    }

    public void testCreateCupCake() {
    }

    public void testGetCurrentVersion() {
    }

    public void testGetConnection() {
    }

    public void testGetVersion() {
    }
}