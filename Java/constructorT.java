public class MyClass {
    // Instance variable
    private String name;

    // Constructor with an argument
    MyClass(String name) {
        this.name = name; // Initialize the instance variable
    }

    // Method to display the name
    void display() {
        System.out.println("Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        MyClass obj = new MyClass("Tanvir"); // Create an object of MyClass with an argument
        obj.display(); // Call the display method to print the name
    }
}
