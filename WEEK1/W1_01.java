import java.util.*;

class W1_01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if ((num & 1) == 0) {
      System.out.println("The number " + num + " is an even number");
    } else {
      System.out.println("The number " + num + " is an odd number");
    }
  }
}
