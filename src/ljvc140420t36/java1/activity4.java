package ljvc140420t36.java1;

import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        System.out.printf("%d + %d +%d = %d", n, n * 11, n * 111, n + n * 11 + n * 111);
    }
}
