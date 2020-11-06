package CupCakeProjekt.Backend.infrastructure;

import java.io.*;
import java.sql.Connection;

import CupCakeProjekt.Backend.api.CupCakeAppRepository;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;
import CupCakeProjekt.Backend.entries.Migrate;
import org.apache.ibatis.jdbc.ScriptRunner;

import java.sql.DriverManager;
import java.sql.*;


public class Database implements OrderRepository, CupCakeRepository {
    private static CupCakeAppRepository api;
    //Database statement attribute
    private String sqlstatement;

    // Database URL
    private static final String DB_URL = "jdbc:mysql://localhost/cupcakedb?useSSL=false&serverTimezone=UTC";

    // Database credentials
    private static final String USER = "Employee";


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

    public Database() {
        if (getCurrentVersion() != api.getVersion()) {
            throw new IllegalStateException("Database in wrong state, expected:"
                    + api.getVersion() + ", got: " + getCurrentVersion());
        }
    }

    public static void runMigrations() throws IOException, SQLException {
        int version = Database.getCurrentVersion();
        while (version < api.getVersion()) {
            System.out.printf("Current DB version %d is smaller than expected %d\n", version, api.getVersion());
            runMigrationByID(version + 1);
            int new_version = Database.getCurrentVersion();
            if (new_version > version) {
                version = new_version;
                System.out.println("Updated database to version: " + new_version);
            } else {
                throw new RuntimeException("Something went wrong, version not increased: " + new_version);
            }
        }
    }

    public static void runMigrationByID(int i) throws IOException, SQLException {
        String migrationFile = String.format("migrate/%d.sql", i);
        System.out.println("Running migration: " + migrationFile);
        InputStream stream = Migrate.class.getClassLoader().getResourceAsStream(migrationFile);
        if (stream == null) {
            System.out.println("Migration file, does not exist: " + migrationFile);
            throw new FileNotFoundException(migrationFile);
        }
        try(Connection conn = Database.getConnection()) {
            conn.setAutoCommit(false);
            ScriptRunner runner = new ScriptRunner(conn);
            runner.setStopOnError(true);
            runner.runScript(new BufferedReader(new InputStreamReader(stream)));
            conn.commit();
        }
        System.out.println("Done running migration");
    }

}
