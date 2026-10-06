// JAVA INHERITANCE PUBLIC VS PRIVATE ACCESS MOFIFIERS

package WEEK3;

import java.util.*;

class student {
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class W03_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of your student: ");
        String name = sc.nextLine();
        System.out.print("Enter the age of the student: ");
        int age = sc.nextInt();

        student s1 = new student(name, age);
        System.out.println("Name is : " + s1.getName() + " and The age is : " + s1.getAge());
        sc.close();
    }
}