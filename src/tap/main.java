package tap;

public class main {
    public static void main(String[] args) {
        //tinh chu vi va dien tich hinh chu nhat
        float chieuDai = 4.5f;
        float chieuRong = 3.4f;

        float chuViHinhCN = HinhChuNhat.chuVi(chieuDai, chieuRong);
        float dienTichHinhCN = HinhChuNhat.dienTich(chieuDai,chieuRong);

        System.out.println("Chu vi va Dien tich Hinh CN la ");
        System.out.println(chuViHinhCN);
        System.out.println(dienTichHinhCN);

        float banKinh = 3f;

        float chuViHinhTron = HinhTron.chuVi(banKinh);
        float dienTichHinhTron = HinhTron.dienTich(banKinh);

        System.out.println("Chu vi va Dien tich hinh tron la ");
        System.out.println(chuViHinhTron);
        System.out.println(dienTichHinhTron);

        //Hinh vuong
        float canh = 5f;
        System.out.println("Chu vi va Dien tich hinh vuong la  ");
        System.out.println(HinhVuong.chuVi(canh));
        System.out.println(HinhVuong.dienTich(canh));
    }
}
