import java.util.*;

public class W1_04{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Table of a Number");

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i ++){
            System.out.println(num +" * " + i + " = " + (num*i));
        }        
    }
}
