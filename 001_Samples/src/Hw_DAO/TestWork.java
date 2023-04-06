package Hw_DAO;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestWork {
    private final String URL = "jdbc:mysql://localhost:3306/car_shop";
    private final String LOGIN = "root";
    private final String PASSWORD = "Root_123";
    public TestWork() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
        public List<Test_table> getAllTest () {
            Connection connection = null;
            Statement statement = null;
            List<Test_table> test = new ArrayList<>();
            try {
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
                statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM test_table");

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String value= resultSet.getString(2);
                    String date = resultSet.getString("date");
                    Test_table test_table = new Test_table(id, value,date);
                    test.add(test_table);
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
            return test;
        } }