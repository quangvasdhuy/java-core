package ljvc140420t36.java1;

import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        System.out.println(tong());
    }
    public static int tong(){
        int temp = 0;int f = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int n = scanner.nextInt();
        for(int i=0 ; i=3 ;i++){
            f = n * 10 +n;
            temp +=f;
        }
        return temp;

    }
}
