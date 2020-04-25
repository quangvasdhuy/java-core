package ljvc140420t36.java3;

import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang:");
        int size = scanner.nextInt();

        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Nhap a[%d]=", i);
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("\na[%d]=%d", i, myArray[i]);
        }

        //1. Value and position of maximum element (In ra vị trí và giá trị của phần tử lớn nhất trong mảng)
        int Max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > Max) {
                Max = myArray[i];
            }
        }
        System.out.printf("\nPhan tu lon nhat la %d ", Max);
        System.out.print("Vi tri: ");
        for (int i = 0; i < myArray.length; i++) {
            if (Max == myArray[i]) {
                System.out.println(i);
            }
        }
        //2. Value and position of minimum element (In ra vị trí và giá trị của phần tử nhỏ nhất trong mảng).
        int Min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < Min) {
                Min = myArray[i];
            }
        }
        System.out.printf("\nPhan tu nho nhat la %d ", Min);
        System.out.print("Vi tri: ");
        for (int i = 0; i < myArray.length; i++) {
            if (Min == myArray[i]) {
                System.out.println(i);
            }
        }
        //3. Value and position of 2nd maximum element (In ra vị trí và giá trị của phần tử lớn thứ 2 trong mảng)
        int Max2 = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (Max2 < Max && myArray[i] != Max && Max2 < myArray[i]) {
                Max2 = myArray[i];
            }
        }
        System.out.printf("Phan tu lon thu 2 la %d ", Max2);
        System.out.print("Vi tri: ");
        for (int i = 0; i < myArray.length; i++) {
            if (Max2 == myArray[i]) {
                System.out.println(i);
            }
        }
        //4. Value and position of 2nd minimum element (In ra vị trí và giá trị của phần tử nhỏ thứ 2 trong mảng)
        int Min2 = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (Min2 > Min && myArray[i] != Min && Min2 > myArray[i]) {
                Min2 = myArray[i];
            }
        }
        System.out.printf("Phan tu nho thu 2 la %d ", Min2);
        System.out.print("Vi tri: ");
        for (int i = 0; i < myArray.length; i++) {
            if (Min2 == myArray[i]) {
                System.out.println(i);
            }
        }
        //5. Replace all negative element by zero (Thay thế tất các phần tử âm bằng số 0)
        int[] arr = myArray;
        System.out.print("Mang moi la: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.printf("\na[%d]=", i);
            System.out.print(arr[i]);
        }
        //6. Sort the array in ascending order (Sắp xếp mảng theo chiều tăng dần)
        int temp;
        System.out.printf("\nMang da sap xep la: ");
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%5d", myArray[i]);
        }
    }
}

