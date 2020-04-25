package ljvc140420t36.java3;

import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a[]=new int[256];
        int len = s.length();
        for(int i=0;i<len;i++){
            a[s.charAt(i)]++;
        }
        int max = -1;

    }
}
