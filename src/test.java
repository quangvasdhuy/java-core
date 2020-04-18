import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("Chao mung ban "+name+" den voi khoa hoc Javacore" + "TEST");

        System.out.println("Nhap vao tuoi cua ban: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age );
    }
}
