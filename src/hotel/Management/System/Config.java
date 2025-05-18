package hotel.managment.system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Con {
Connection connection;
Statement statement;

public Con() {
    try{

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotelms","root","root");
        statement = connection.createStatement();
    } catch (Exception s) {
        s.printStackTrace();
    }
}

}
