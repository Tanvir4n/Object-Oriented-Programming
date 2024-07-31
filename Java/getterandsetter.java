class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
}

public class Main {
    public static void main(String[] args) {
        MyEmployee aryan = new MyEmployee();
        aryan.setId(911); // Use setter to set the value
        aryan.setName("aryan"); // Use setter to set the value

        // You can use getters to retrieve the values
        System.out.println("ID: " + aryan.getId());
        System.out.println("Name: " + aryan.getName());
    }
}
