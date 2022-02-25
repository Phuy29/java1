package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapDSNV() {
        while (true) {
            String choice;
            System.out.println("Nhap loai nhan vien (Ky su/Cong nhan): ");
            choice = sc.nextLine();
            if (choice.equals("")) {
                break;
            } else if (choice.equalsIgnoreCase("Ky su")) {
                KySu ks = new KySu();
                ks.nhapNV();
                list.add(ks);
            } else if (choice.equalsIgnoreCase("Cong nhan")) {
                CongNhan cn = new CongNhan();
                cn.nhapNV();
                list.add(cn);
            } else {
                System.out.println("Vui long nhap lai!");
            }
        }
    }

    public void hienDSVN() {
        System.out.println("Thong tin nhan vien:");
        for (NhanVien nv : list) {
            nv.hienNV();
        }
    }

    public void menu() {
        while (true) {
            int chon;
            System.out.println("1.Nhap nhan vien");
            System.out.println("2.Xuat danh sach nhan vien");
            System.out.println("0.Thoat");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhapDSNV();
                    break;
                case 2:
                    hienDSVN();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }

}
