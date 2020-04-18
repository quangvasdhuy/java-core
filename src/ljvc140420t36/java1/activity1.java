package ljvc140420t36.java1;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int du = a % b;

        System.out.println("a+b="+tong);
        System.out.println("a-b="+hieu);
        System.out.println("a*b="+tich);
        System.out.println("a/b="+thuong);
        System.out.println("a%b="+du);

    }
}
