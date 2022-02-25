package BT_JAVA;

import java.util.Scanner;

public class baitap {
    public String mssv, ten, lop;
    public double diem;
    Scanner input = new Scanner(System.in);

    public void nhap() {
        Scanner input = new Scanner(System.in);
        int soluong;
        System.out.println("Moi ban nhap so luong:");
        soluong = Integer.parseInt(input.nextLine());
        System.out.println("Moi ban nhap mssv:");
        mssv = input.nextLine();
        System.out.println("Moi ban nhap ten:");
        ten = input.nextLine();
        System.out.println("Moi ban nhap lop: ");
        lop = input.nextLine();
        System.out.println("Moi ban nhap diem: ");
        diem = Double.parseDouble(input.nextLine());
    }

    public void xuat() {
        System.out.println("Mssv:" + mssv);
        System.out.println("Ten: " + ten );
        System.out.println("Lop: " + lop);
        System.out.println("Diem: " + diem);
    }

    

    
}
