// COUNT THE NO OF DIGITS PRESENT IN A NUM

package WEEK3;

import java.util.*;

class W03_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("The count of digit is : " + count);
        sc.close();

    }
}