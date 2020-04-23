package viettus;

public class giaithua {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 10;
        System.out.println("Giai thua cua " + a + " la " + giaithua.tinhGiaiThua(a));
        System.out.println("Giai thua cua " + b + " la " + giaithua.tinhGiaiThua(b));
        System.out.println("Giai thua cua " + c + " la " + giaithua.tinhGiaiThua(c));
    }

    public static long tinhGiaiThua(int n) {
        int giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i < n; i++) {
                giai_thua *= i;
            }
        }
        return giai_thua;
    }
}
