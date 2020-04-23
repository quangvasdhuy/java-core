package viettus;

public class songuyento {
    public static void main(String[] args) {
        System.out.println("100 so nguyen to dau tien la:");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        } else {
            int SquareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= SquareRoot; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
