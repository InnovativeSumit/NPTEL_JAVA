// CALCULATE THE FACTORS OF A NUMBER

package WEEK3;

import java.util.*;

class W03_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");

            }
        }
        sc.close();
    }
}