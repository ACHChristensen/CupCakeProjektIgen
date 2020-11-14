package CupCakeProjekt.Backend.infrastructure;

import java.sql.Connection;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.Customer;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;
import CupCakeProjekt.Backend.domain.Repositories.UserRepository;

import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database implements OrderRepository, CupCakeRepository, UserRepository {

    //Database statement attribute
    private static String sqlstatement;

    // Database URL
    private static final String DB_URL = "jdbc:mysql://localhost/cupcakedb?useSSL=false&serverTimezone=UTC";

    // Database credentials
    private static final String USER = "Employee";

    public static int versionItSHouldBe = 3;

    public Database() {
        if (getCurrentVersion() != versionItSHouldBe) {
            throw new IllegalStateException("Database in wrong state, expected:"
                    + versionItSHouldBe + ", got: " + getCurrentVersion());
        }
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
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USER, null);
    }

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
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return new Topping(flavor, price);
    }

    //TODO - OVerrride notian problem
    public List<Topping> showToppingsChoice() {
        double price = -1.0; //TODO Bedre default ? Lav validering
        List<Topping> toppings = new ArrayList();
        String flavor;
        sqlstatement = "SELECT * FROM cupcakedb.toppings";

        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                flavor = rs.getString("flavor");
                price = rs.getDouble("price");
                Topping tmpTop = new Topping(flavor, price);
                toppings.add(tmpTop);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return toppings;
    }

    @Override
    public Bottom createBottom(String flavor) {
        double price = -1.0; //TODO Bedre default ? Lav validering
        flavor = flavor.toLowerCase();
        sqlstatement = "SELECT bottoms.price FROM cupcakedb.bottoms WHERE bottoms.flavor =?;";

        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1, flavor);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                price = rs.getDouble("price");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return new Bottom(flavor, price);
    }

    //TODO - OVerrride notian problem
    public List<Bottom> showBottomsChoice() {
        double price = -1.0; //TODO Bedre default ? Lav validering
        List<Bottom> bottoms = new ArrayList();
        String flavor;
        sqlstatement = "SELECT * FROM cupcakedb.bottoms";

        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                flavor = rs.getString("flavor");
                price = rs.getDouble("price");
                Bottom tmpBot = new Bottom(flavor, price);
                bottoms.add(tmpBot);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return bottoms;
    }

    //TODO - shouldn't be here
    @Override
    public CupCake createCupCake(Topping top, Bottom bot) {
        CupCake cupCake = new CupCake(bot, top);
        return cupCake;
    }


    @Override
    public OrderLine addAsOrderLine(CupCake cupCake, int quanitity) {

        return null;
    }

    //TODO - OVerrride notian problem
    public boolean compareUsers(String email) {
        sqlstatement = "SELECT users.name FROM cupcakedb.users WHERE users.email = ?;";
        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                return true;
        } catch (SQLException | ClassNotFoundException e /*| UserNotFoundException e*/) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    //TODO - OVerrride notian problem
    public String getNameFromDB(String email) {
        String name = null;
        sqlstatement = "SELECT users.name FROM cupcakedb.users WHERE users.email = ?;";
        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                name = rs.getString("name");
            };
        } catch (SQLException | ClassNotFoundException e /*| UserNotFoundException e*/) {
            System.err.println(e.getMessage());
        }
        return name;
    }

    public void registerUserInDB(User user){
        sqlstatement = "INSERT INTO cupcakedb.users (name, customer, email, password) VALUES (?,?,?,?);";
        try (Connection conn = getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sqlstatement);
            ps.setString(1,user.getName());
            ps.setBoolean(2,user.getCustommerRole());
            ps.setString(3,user.getEmail());
            ps.setString(4, user.getPassword());
            ps.execute();

        } catch (SQLException | ClassNotFoundException e /*| UserNotFoundException e*/) {
            System.err.println(e.getMessage());
        }
    }


}
