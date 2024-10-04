import java.util.Scanner;

// Class
class Area{
    float a;
    float b;
    float area = 0;

    // Method (calc_area)
    public float calc_area(float a, float b){
        return a * b;
    }
    // Class Close
    
    // Main Method(function)
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        float a = s.nextFloat();
        
        System.out.print("Enter the value of b: ");
        float b = s.nextFloat();

        // Object
        Area areaObj = new Area();
        
        float area = areaObj.calc_area(a, b);
        
        System.out.println("The area is: " + area);
    }
}
