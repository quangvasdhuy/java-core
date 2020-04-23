package ljvc140420t36.java2;

import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Input a number 2: ");
        int n2 = scanner.nextInt();
        int P = 0;
        for(int i=0;i<n2;i++){
            P+=n1;
        }
        System.out.println("Result="+P);
    }
}
