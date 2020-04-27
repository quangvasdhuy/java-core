package ljvc140420t36.java3;

import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        int[] Array = new int[256];
        for (int i = 0; i < s.length(); i++) {
            Array[s.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (max < Array[s.charAt(i)]) {
                max = Array[s.charAt(i)];
                result = s.charAt(i);
            }

        }

        System.out.print("Maximum occurring character:" + result);
        //   System.out.printf("(%d)",index);
    }
}
