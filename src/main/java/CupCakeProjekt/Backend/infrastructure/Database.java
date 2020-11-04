package CupCakeProjekt.Backend.infrastructure;

import java.sql.Connection;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;

import java.sql.DriverManager;
import java.sql.*;


public class Database implements OrderRepository, CupCakeRepository {
    String sqlstatement;
    // Database URL
    private static final String DB_URL = "jdbc:mysql://localhost/cupcakedb?useSSL=false&serverTimezone=UTC";

    // Database credentials
    private static final String USER = "Employee";

    // Database version
    private static final int version = 1;


    @Override
    public Topping createTop(String flavor) {
        double price = -1.0; //TODO Bedre default ? Lav validering
        flavor = flavor.toLowerCase();
        sqlstatement = "SELECT toppings.price FROM cupcakedb.toppings WHERE toppings.flavor = ?;";

        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1, flavor);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("price");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return new Topping(flavor, price);
    }


    @Override
    public Bottom createBottom(String flavor) {
        double price = -1.0; //TODO Bedre default ? Lav validering
        flavor = flavor.toLowerCase();
        sqlstatement = "SELECT bottoms.price FROM cupcakedb.bottoms WHERE bottoms.flavor = ?;";

        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1, flavor);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("price");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return new Bottom(flavor, price);
    }

    @Override
    public CupCake createCupCake(Topping top, Bottom bot) {
        return null;
    }

    public static int getCurrentVersion() {
        try (Connection conn = getConnection()) {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM cupcakedb.properties WHERE properties.name = 'version';");
            if (rs.next()) {
                String column = rs.getString("numberversion");
                return Integer.parseInt(column);
            } else {
                System.err.println("No version in properties.");
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, null);
    }

    public static int getVersion() {
        return version;
    }

    public Database() {
        if (getCurrentVersion() != getVersion()) {
            throw new IllegalStateException("Database in wrong state, expected:"
                    + getVersion() + ", got: " + getCurrentVersion());
        }
    }
}
