package ljvc140420t36.java2;

import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;
        float avg;
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        System.out.printf("sum = 1 + 2 +... + %d = %d\n",n,sum);
        System.out.printf("avg = %.2f",(float)sum/n);
    }
}
