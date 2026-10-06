// INSERT AN ARRAY AND FIND THE BIGGEST ELEMENTS FROM IT 

package WEEK2;

import java.util.*;

class W02_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size  of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the element of the array : ");
        for(int i = 0 ; i <n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array  is : ");
        for(int ele : arr){
            System.out.print(ele+ " ");
        }

        System.out.println(" ");
        int maxi = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>maxi)
            maxi = arr[i];
        }
        
        System.out.println("The biggest element in the array is: "+ maxi);
        sc.close();
    }
}
