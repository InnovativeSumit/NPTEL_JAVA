// CALCULATE THE RADIUS OF A CIRCLE USING OOPS

package WEEK2;

import java.util.*;

class W02_P5 {

    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of a Circle: ");
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.println("The Radius of the Circle is: " + c1.radius);

        sc.close();
    }
}