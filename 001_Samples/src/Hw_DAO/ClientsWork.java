package Hw_DAO;

import com.itvdn.jdbcandhibernate.ex003_result_set.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientsWork {
    private final String URL = "jdbc:mysql://localhost:3306/car_shop";
    private final String LOGIN = "root";
    private final String PASSWORD = "Root_123";
    public ClientsWork() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    } public List<Clients> getAllClients() {
        Connection connection = null;
        Statement statement = null;
        List<Clients> client = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String phone = resultSet.getString("phone");
                Clients clients = new Clients(id,name,age,phone);
                client.add(clients);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return client;
    }

}

