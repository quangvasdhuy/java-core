package ljvc140420t36.java3;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap a[%d]=", i);
            a[i] = scanner.nextInt();
        }
        System.out.println("Mang goc:");
        System.out.print("Length:" + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\na[%d]=%d", i, a[i]);
        }

        System.out.println("\nMảng sau khi loại bỏ tất cả các yếu tố trùng lặp:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j + 1; k < n; k++) {
                        a[k - 1] = a[k];
                    }
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
