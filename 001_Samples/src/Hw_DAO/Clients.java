package Hw_DAO;

public class Clients {
    private int id;
    private String name;
    private  int age;
    private  String phone;

    public Clients(int id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
