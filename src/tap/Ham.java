package tap;

public class Ham {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int hieu = hieuHaiSo(x,y);
        System.out.println(hieu);

        System.out.println(tongHaiSo());

        xinChao();

        float chuViHinhTron = soPi() * 2;
        System.out.println(chuViHinhTron);
    }

    public static int tongHaiSo(){
        int x = 10;
        int y = 15;
        int tong = x + y;
        return tong;
    }
    //ham voi doi so truyen vao
    public  static int hieuHaiSo(int x,int y)   {
        int hieu = x - y;
        return hieu;
    }
    //Ham khong co gia tri tra ve
    public  static void xinChao()   {
        System.out.println("xinChao");
    }
    public static float soPi()  {
        return 3.14f;
    }
}
