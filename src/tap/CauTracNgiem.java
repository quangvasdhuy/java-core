package tap;

import java.util.Scanner;

public class CauTracNgiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Lenh tiep tuc vong lap trong java la gi?");
            System.out.println("1. continue");
            System.out.println("2. break");
            System.out.println("ban bam q de thoat");
            String luaChon = scanner.nextLine();

            if(luaChon.equals("1")){
                System.out.println("Ban tra loi dung");
                break;
            }else if(luaChon.equals("2")){
                System.out.println("Ban lua chon sai");
                break;
            }else if(luaChon.equals("q")){
                break;
            }else{
                System.out.println("Vui long lua chon dap an");
            }
        }

    }
}
