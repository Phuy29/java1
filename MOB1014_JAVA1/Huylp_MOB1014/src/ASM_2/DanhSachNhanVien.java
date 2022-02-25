package ASM_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("")) {
                break;
            }
            System.out.println("Nhap ho ten nv: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap luong co ban: ");
            double luongCoBan = Double.parseDouble(sc.nextLine());
            System.out.println("Ban thuoc phong ban nao:");
            String phongBan = sc.nextLine();
            if (phongBan.equalsIgnoreCase("Hanh Chinh")) {
                System.out.println("Nhap ngay cong: ");
                Double ngayCong = sc.nextDouble();
                NhanVien newNV = new NhanVienHanhChinh(ID, hoTen, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Truong Phong")) {
                System.out.println("Nhap luong trach nhiem: ");
                double luongTrachNhiem = sc.nextDouble();
                NhanVien newNV = new TruongPhong(ID, hoTen, luongCoBan, phongBan, luongTrachNhiem);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Tiep Thi")) {
                System.out.println("Nhap hue hong: ");
                double hueHong = sc.nextDouble();
                NhanVien newNV = new NhanVienTiepThi(ID, hoTen, luongCoBan, phongBan, hueHong);
                list.add(newNV);
            } else {
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public void xuat() {
        for (NhanVien nv : list) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(),
                    nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nhan vien can tim:");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(),
                        nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai");
        }
    }

    public void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa:");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai");
        } else {
            System.out.println("Nhan vien da duoc xoa");
        }
    }

    public void capNhatNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can cap nhat:");
        String IDFind = sc.nextLine();
        NhanVien find = null;
        for (NhanVien nv : list) {
            if (IDFind.equalsIgnoreCase(nv.getID())) {
                find = nv;
                break;
            }
        }
        if (find == null) {
            System.out.println("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("")) {
                ID = find.getID();
            }
            System.out.println("Nhap ho ten nv: ");
            String hoTen = sc.nextLine();
            if (hoTen.equals("")) {
                hoTen = find.getHoTen();
            }
            System.out.println("Nhap luong co ban: ");
            String luongCoBan = sc.nextLine();
            if (luongCoBan.equals("")) {
                luongCoBan = String.valueOf(find.getLuongCoBan());
            }
            System.out.println("Cap nhat thanh cong");
        } else {
            System.out.println("Nhan vien da duoc xoa");
        }
    }

    public void timNVLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoang luong min:");
        double luong1 = sc.nextDouble();
        System.out.println("Nhap khoang luong max: ");
        double luong2 = sc.nextDouble();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (luong1 <= nv.getLuong() && luong2 >= nv.getLuong()) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(),
                        nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai");
        }
    }

    public void sapXepTen() {
        Comparator<NhanVien> sapXep = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2){
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        };
        Collections.sort(list,sapXep);
        xuat();
    }

    public void sapXepLuong() {
        Comparator<NhanVien> sapXep = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2){
                if (nv1.getLuong()>nv2.getLuong()) return 1;
                else return -1;
            }
        };
        Collections.sort(list,sapXep);
        xuat();
    }

    public void top5NV() {
        Collections.sort(list, (a,b) -> (int) (b.getLuong() - a.getLuong()));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", list.get(i).getID(),
                    list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong());
        }
    }

    

    public void menu() {
        while (true) {
            Scanner input = new Scanner(System.in);
            int choice;
            System.out.println("Menu");
            System.out.println("1.Nhap danh sach tu nhan vien");
            System.out.println("2.Xuat danh sach nhan vien");
            System.out.println("3.Tim kiem nhan vien theo ma");
            System.out.println("4.Xuat nhan vien theo ma");
            System.out.println("5.Cap nhat thong tin nhan vien theo ma");
            System.out.println("6.Tim cac nhan vien theo khoang luong");
            System.out.println("7.Sap xep nhan vien theo ho ten ");
            System.out.println("8.Sap xep nhan vien theo thu nhap");
            System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0.Thoat");
            System.out.println("--------------------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timNV();
                    break;
                case 4:
                    xoaNV();
                    break;
                case 5:
                    capNhatNV();
                    break;
                case 6:
                    timNVLuong();
                    break;
                case 7:
                    sapXepTen();
                    break;
                case 8:
                    sapXepLuong();
                    break;
                case 9:
                    top5NV();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }

    }
}
