package De_Thi_Thu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner ip = new Scanner(System.in);
    static ArrayList<Laptop> list = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("====Menu===");
            System.out.println("1.Nhap danh sach laptop");
            System.out.println("2.Xuat danh sach laptop");
            System.out.println("3.Xuat danh sach laptop theo khoang version");
            System.out.println("4.Tim laptop co version > 2015");
            System.out.println("5.Xuat thong tin may tinh bang");
            System.out.println("0.Thoat");
            System.out.println("Moi ban nhap lua chon:");
            choice = Integer.parseInt(ip.nextLine());
            switch (choice) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xuatLaptopVersion();
                    break;
                case 4:
                    timLaptopVersion();
                    break;
                default:
                    break;
            }
        } while (true);
    }

    public static void nhapDS() {
        do {
            String chon;
            Laptop laptop = new Laptop();
            laptop.nhap();
            list.add(laptop);
            System.out.println("Ban co muon nhap tiep hay k (Y/N)?");
            chon = ip.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
        System.out.println("");
    }

    public static void xuatDS() {
        for (Laptop laptop : list) {
            laptop.xuat();
        }
        System.out.println("");
    }

    public static void xuatLaptopVersion() {
        System.out.println("Nhap khoang version min:");
        double min = ip.nextDouble();
        System.out.println("Nhap khoang version max:");
        double max = ip.nextDouble();
        boolean check = false;
        for (Laptop laptop : list) {
            if (min <= laptop.getVersion() && laptop.getVersion() <= max) {
                laptop.xuat();
                check = true;
                break;
            }
        }
        if (check = false) {
            System.out.println("Danh sach khong ton tai!");
        }
    }

    public static void timLaptopVersion() {
        boolean check = false;
        for (Laptop laptop : list) {
            if (laptop.getVersion() > 2015) {
                System.out.printf("Ten laptop: %s | Version: %s | Mau: %s",laptop.getName(),laptop.getVersion(),laptop.getColor());
                check = true;
                break;
            }
        }
        if (check = false) {
            System.out.println("Danh sach khong ton tai!");
        }            
    }

    public static void MayTinhBang() {
        while (true) {
            MayTinhBang mayTinhBang = new MayTinhBang();
            
        }
    }


}
