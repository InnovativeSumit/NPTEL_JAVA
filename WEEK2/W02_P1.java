// AREA OF AN RECTANGLE 

package WEEK2;

import java.util.*;

class W02_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Length of rectangle : ");
        double length = sc.nextDouble();

        
        System.out.print("Enter the Width of Rectangle : ");
        double width = sc.nextDouble();

        double area = length * width ;
        System.out.println(" ");
        
        System.out.printf("The area of the  Rectangle  is :%.2f" ,area);
        sc.close();
    }
}