package ljvc140420t36.java1;

import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "PlusPlus Academy";
        String s2 = "PlusPlus Academy";
        String s = s1;
        System.out.println("Where are they learning Javacore?");
        s = scanner.nextLine();
        if (s.equals(s2)) {
            System.out.println("Welcome to Javacore class");
        } else {
            System.out.println("Input again");
        }
    }
}
