package LAB_4;

public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3 = new SanPham("Game", 500, 10);
        sp3.xuat();
        SanPham sp4 = new SanPham("Axie", 10000, 2);
        sp4.xuat();
    }
    
}
