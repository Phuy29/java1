package BT_JAVA;

import java.util.Scanner;

public class flying_object {
    String maChuyenBay, diemdi, diemden, ngay;
    int soluong;
    Scanner input = new Scanner(System.in);

    public flying_object(String maChuyenBay, String diemdi, String diemden, String ngay) {
        this.maChuyenBay = maChuyenBay;
        this.diemdi = diemdi;
        this.diemden = diemden;
        this.ngay = ngay;
        this.soluong = soluong;
    }

    public flying_object() {

    }

    public void nhap() {
        try {
            System.out.println("Nhap ma chuyen bay: ");
            maChuyenBay = input.nextLine();
            System.out.println("Nhap ma diem di: ");
            diemdi = input.nextLine();
            System.out.println("Nhap ma diem den: ");
            diemden = input.nextLine();
            System.out.println("Nhap ngay khoi hanh: ");
            ngay = input.nextLine();
            System.out.println("Nhap so luong hanh khach: ");
            soluong = Integer.parseInt(input.nextLine());
        } catch (Exception ex) {
            System.out.println("Ban nhap bi loi");
        }
    }

    public void xuat() {
        try {
            System.out.println("Ma chuyen bay la: " + maChuyenBay);
            System.out.println("Diem di la: " + diemdi);
            System.out.println("Diem den la: " + diemden);
            System.out.println("Ngay khoi hanh: " + ngay);
            System.out.println("So luong hanh khach: " + soluong);
        } catch (Exception ex) {
            System.out.println("Co loi xay ra" + ex);
        }
    }

}
