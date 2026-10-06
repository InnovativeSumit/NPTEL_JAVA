// CALCULATE THE PERIMETER AND AREA OF A RECTANGLE

package WEEK1;

import java.util.*;

public class W1_02{
    public static double perimeter (double length , double width){
        return 2 * ( length + width);
    }

    public static double area (double length , double width){
        return length*width;
        
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Area & Perimeter of a Rectangle \n");

        System.out.print("Enter the length of a Reactangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of a Reactangle: ");
        double width  = sc.nextDouble();


        double res1 = perimeter(length,width);
        System.out.printf("The perimeter is  %.2f", res1);
        
        System.out.print("\n");
        
        double res2 = area(length,width);
        System.out.printf("The area is  %.2f", res2);
        sc.close();
   
    }
}
