package ljvc140420t36.java3;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = scanner.nextInt();

        int[] Array = new int[size];
        for (int i = 0; i < Array.length ; i++) {
            System.out.printf("Nhap a[%d]=",i);
            Array[i] = scanner.nextInt();
        }
        System.out.println("Mang goc:");
        System.out.print("Length:"+Array.length);
        for (int i = 0; i < Array.length ; i++) {
            System.out.printf("\na[%d]=%d",i,Array[i]);
        }
        System.out.println("Mảng sau khi loại bỏ tất cả các yếu tố trùng lặp:");
        
    }
}
