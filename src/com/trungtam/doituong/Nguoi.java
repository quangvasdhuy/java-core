package com.trungtam.doituong;

public class Nguoi {
    String ten;
    String diaChi;
    int tuoi;

    public void diLai(String ten) {
        System.out.println(ten + " di lai ");
    }


    public static void main(String[] args) {
        new Nguoi(); //doi tuong 1
        Nguoi anhA = new Nguoi();//dt2
        Nguoi anhB = new Nguoi();//dt3
        anhA.diLai("anh A");
        anhB.diLai("anh B");
    }
}
