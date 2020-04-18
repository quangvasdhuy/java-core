package ljvc140420t36.java1;

import java.util.Scanner;

public class activty3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
       for ( int i=1 ; i<=10 ; i++ ){
           System.out.printf("\n%d * %d = %d",n,i,i*n);
       }
    }
}
