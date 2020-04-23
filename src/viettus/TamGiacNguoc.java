package viettus;

import java.util.Scanner;

public class TamGiacNguoc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println();
        //ve phan tam giac nguoc
        for(int i=1;i<=n;i++){
            //phan 1
            for(int j =1;j<=i;j++){
                System.out.print(" ");
            }
            //phan 2
            for (int c=1;c<=n;c++){
                System.out.print("*");

            }
            //phan 3
            for(int c= n-i ; c>=1 ;c--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
