// JAVA INHERTANCE USI TO CAL THE ADD AND MULT USING OOPS 

package WEEK3;

import java.util.*;

class cls1 {
    void add(int num1, int num2) {
        System.out.println("The addition is : " + (num1 + num2));
    }
}

class cls2 extends cls1 {
    void mult(int num1, int num2) {
        System.out.println("The mult is : " + (num1 * num2));
    }

    void task(int num1, int num2) {
        System.out.println("The tsk is : " + ((num1 + num2) * (num1 * num2)));
    }
}

public class W03_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of 1st number: ");
        int num2 = sc.nextInt();

        cls1 c1 = new cls1();
        c1.add(num1, num2);

        cls2 c2 = new cls2();
        c2.mult(num1, num2);
        c2.task(num1, num2);
        c2.add(num1, num2);

        sc.close();


    }
}