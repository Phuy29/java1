package LAB_4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
    Scanner sc = new Scanner(System.in);

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    void xuat() {
        System.out.printf("Ten san pham: %s | Don gia: %f | Giam gia: %f | Thue nhap khau: %f",
                tenSP, donGia, giamGia, getThueNhapKhau());
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public SanPham(){
        
    }
    void nhap() {

        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
}
