package Hw_DAO;

import com.itvdn.jdbcandhibernate.ex003_result_set.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientsWork clientsWork= new ClientsWork();
        List<Clients> client = clientsWork.getAllClients();

        for (Clients clients : client) {
           System.out.println(clients.getId() + " " + clients.getName() + " " + clients.getAge() + " " + clients.getPhone());
        }
TestWork testWork = new TestWork();
        List<Test_table>test = testWork.getAllTest();
        for (Test_table test_table :test) {
            System.out.printf(test_table.getId() +" "+test_table.getValue() +" "+test_table.getDate());
        }

    }
}
