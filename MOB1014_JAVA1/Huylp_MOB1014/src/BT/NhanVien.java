package BT;

import java.util.Scanner;

public abstract class NhanVien {
    public String hoTen;

    public String manv;
    public String regManv = "^PH[0-9]{5,6}$";

    public String ngaySinh;
    public String regNgaySinh =  "^\\d{1,2}-(\\d{1}|1[0-2]{1})-\\d{4}$";

    public double lcb;

    Scanner sc = new Scanner(System.in);

    public NhanVien(){

    }

    public NhanVien(String hoTen, String manv, String ngaySinh, Double lcb) {
        this.hoTen = hoTen;
        this.manv = manv;
        this.ngaySinh = ngaySinh;
        this.lcb = lcb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLcb() {
        return lcb;
    }

    public void setLcb(Double lcb) {
        this.lcb = lcb;
    }

    public void nhapNV(){
        System.out.println("Nhap thong tin nhan vien:");
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ma nv: ");
        manv = sc.nextLine();
        if (!manv.matches(regManv)) {
            System.out.println("Du lieu khong dung dinh dang");
        }
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        if (!ngaySinh.matches(regNgaySinh)) {
            System.out.println("Du lieu khong dung dinh dang");
        }
        System.out.println("Nhap luong co ban: ");
        lcb = Double.parseDouble(sc.nextLine());
    }
    
    abstract double getLuong();
    abstract public void hienNV();

}
