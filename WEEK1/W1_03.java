import java.util.*;

public class W1_03{
    
    public static double volume (double height , double radius){
        double  pi = 3.14159265359;
        return  pi * radius * radius * height;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Volume of a Cylinder \n");

        System.out.print("Enter the radius of a Cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of a Cylinder: ");
        double height  = sc.nextDouble();


        double res1 = volume(radius, height);
        System.out.printf("The perimeter is  %.2f", res1);
            
    }
}
