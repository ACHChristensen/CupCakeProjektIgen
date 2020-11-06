package CupCakeProjekt.Backend.infrastructure;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseTest extends TestCase {

    Database db;
    Connection connection;

    public void setUp() throws Exception {
        //arrange
        db = new Database();
        connection = Database.getConnection();
    }


    @Test
    public void nytest(){

    }
    public void testCreateTop_ByFlavorToString() {
        //act
        Topping top1 = db.createTop("Chocolate");
        //Topping top2 = new Topping ("chocolate", 5.0);
        //assert
        assertEquals(top1.toString(), top1.toString());
    }

    public void testCreateBottom() {
        db = new Database();
        System.out.println("hej med dig due");
        System.out.println(connection);
        assertNotNull(db);
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