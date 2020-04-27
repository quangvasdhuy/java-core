package ljvc140420t36.java3;

import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Printf reverse: " + reverse);
    }
}
