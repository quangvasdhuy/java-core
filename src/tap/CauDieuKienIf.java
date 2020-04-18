package tap;

import java.util.Scanner;

public class CauDieuKienIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("vui log nhap gia tri cua x");

        int x = scan.nextInt();

        //cau dieu kien if

        if (x > 5) {
            System.out.println("Gia tri cua x >5");
        }
        if (x!=5){
            System.out.println("Gia tri cua x khac 5");
        }
        System.out.println("Ket thuc");
    }
}
