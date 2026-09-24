import java.util.*;

public class W1_05{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Quotient and Remainder of a Number");

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("The Remainder is: " + (num1%num2));
        System.out.println("The Quotient  is: " + (num1/num2));
               
    }
}
