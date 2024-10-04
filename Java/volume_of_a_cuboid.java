import java.util.Scanner;

class Cuboid {
    public float calc_volume(float length, float width, float height) {
        return length * width * height;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the length of the cuboid (a): ");
        float length = s.nextFloat();
        
        System.out.print("Enter the width of the cuboid (b): ");
        float width = s.nextFloat();
        
        System.out.print("Enter the height of the cuboid (c): ");
        float height = s.nextFloat();
        
        Cuboid cuboidObj = new Cuboid();
        
        float volume = cuboidObj.calc_volume(length, width, height);
        
        System.out.println("The volume of the cuboid is: " + volume);
    }
}
