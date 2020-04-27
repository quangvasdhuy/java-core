package ljvc140420t36.java3;

import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao kich thuoc mang a: ");
        int n1 = scanner.nextInt();

        int a[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("\na[%d]=%d", i, a[i]);
        }

        System.out.println("\nNhap vao kich thuoc mang b: ");
        int n2 = scanner.nextInt();

        int b[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            System.out.printf("b[%d]= ", i);
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.printf("\na[%d]=%d", i, b[i]);
        }

        int c[] = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
        }
        System.out.println("Mang c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("\na[%d]=%d", i, c[i]);
        }
    }
}
