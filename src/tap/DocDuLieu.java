package tap;

import java.util.Scanner;

public class DocDuLieu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vui long nhap vao gia tri");

        int x = scan.nextInt();

        System.out.println("Gia tri cua x la " + x);

        System.out.println("Vui long nhap gia tri cua y va z");

        long y = scan.nextLong();
        double d = scan.nextDouble();

        double tong = d + y;

        System.out.println("Tong 2 so nhap vao la " + tong);

       boolean b = scan.nextBoolean();
       short s = scan.nextShort();
       String ss = scan.nextLine();
    }
}
