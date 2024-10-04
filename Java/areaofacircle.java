import java.util.Scanner;

class CircleArea {
    public float calc_area(float radius) {
        return (float) (Math.PI * radius * radius);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        float radius = s.nextFloat();
        
        CircleArea areaObj = new CircleArea();
        
        float area = areaObj.calc_area(radius);
        
        System.out.println("The area of the circle is: " + area);
    }
}
