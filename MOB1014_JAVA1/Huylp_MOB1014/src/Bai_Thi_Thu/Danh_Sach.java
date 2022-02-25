package Bai_Thi_Thu;

import java.util.ArrayList;
import java.util.Scanner;

public class Danh_Sach {
    static ArrayList<Film_info> list = new ArrayList<>();
    static Scanner ip = new Scanner(System.in);

    public void nhapFilm() {
        while (true) {
            int soLuong;
            System.out.println("Nhap so luong film muon nhap: ");
            soLuong = Integer.parseInt(ip.nextLine());
            if (soLuong >= 1) {
                for (int i = 0; i < soLuong; i++) {
                    System.out.printf("Nhap thong tin film thu %d: \n", i + 1);
                    Film_007 listFilm = new Film_007();
                    listFilm.Input_flim();
                    list.add(listFilm);
                }
            } else {
                System.out.println("Ban phai nhap it nhat 3 film!");
                break;
            }
        }
    }

    public void xuatFilm() {
        for (Film_info listFilm : list) {
            listFilm.Output_film();
        }
    }

    public void timNVtheoNam() {
        System.out.println("Nhap nam can tim: ");
        String nam = ip.nextLine();
        Boolean check = true;
        for (Film_info film : list) {
            if (nam.equals(film.namSanXuat)) {
                film.Output_film();
                check = false;
                return;
            }
        }
        if (check == true) {
            System.out.println("Film khong ton tai");
        }
    }

    public void timFilmMax() {
        Film_info max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        System.out.println("Film co doanh thu cao nhat la: " + max);
    }

    public void menu() {
        while (true) {
            int choice;
            System.out.println("Menu:");
            System.out.println("1.Nhap thong tin film ");
            System.out.println("2.Hien thi danh sach film ");
            System.out.println("3.Tim kiem film theo nam ");
            System.out.println("4.In ra film co doanh thu cao nhat ");
            System.out.println("5.Thoat ");
            System.out.println("Nhap lua chon:");
            choice = Integer.parseInt(ip.nextLine());
            switch (choice) {
                case 1:
                    nhapFilm();
                    break;
                case 2:
                    xuatFilm();
                    break;
                case 3:
                    timNVtheoNam();
                    break;
                case 4:
                    timFilmMax();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }
}
