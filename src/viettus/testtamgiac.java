package viettus;

import java.util.Scanner;

public class testtamgiac {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        //int num;
        n = scanner.nextInt();
        System.out.println();
        //n = num;
        // vẽ phần tam giác ngược
        /*for (int r = 1; r <= num; r++) {
            // phần 1
            for (int sp = 1; sp <= r; sp++) {
                System.out.print("^");
            }
            // phần 2
            for (int c = 1; c <= n; c++) {
                System.out.print("*");
            }
            // phần 3
            for (int c = num - r; c >= 1; c--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }*/
        for (int r = 1; r <= n; r++) {
            // phần 1
            for (int sp = n - r + 1; sp > 1; sp--) {
                System.out.print("^");
            }
            // phần 2
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            // phần 3
            for (int c = r - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
