// SUM OF LENGTH AND WIDTH OF ARECTANGLE

package WEEK2;

import java.util.*;

public class W02_P4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Length of rectangle : ");
        double length = sc.nextDouble();

        
        System.out.print("Enter the Width of Rectangle : ");
        double width = sc.nextDouble();

        double sum = (length+width) ;
        System.out.println(" ");
        
        System.out.printf("The Perimeter of the  Rectangle  is :%.2f" ,sum);
        sc.close();
    }
}
