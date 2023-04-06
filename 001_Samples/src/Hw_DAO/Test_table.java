package Hw_DAO;

public class Test_table {
 private  int id;
 private  String value;
 private  String date;

    public Test_table(int id, String value, String date) {
        this.id = id;
        this.value = value;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }
}
