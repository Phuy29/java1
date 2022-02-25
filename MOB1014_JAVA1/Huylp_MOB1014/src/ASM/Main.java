package ASM;

import java.util.Scanner;

public class Main {
    static int soluong;
    static String[] ma, ten, email;
    static double[] luong,luong1,hoahong;

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
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
                    bai1();
                    break;
                case 2:
                    bai2();
                case 3:
                    bai3();
                default:
                    break;

            }
        }

    }

    public static void bai1() {
        Scanner input = new Scanner(System.in);
        int choice1;
        int soluong;
        String[] ma, ten, email;
        double[] luong, luong1, hoahong;
        System.out.println("Moi ban nhap so luong nhan vien: ");
        soluong = Integer.parseInt(input.nextLine());
        ma = new String[soluong];
        ten = new String[soluong];
        email = new String[soluong];
        luong = new double[soluong];
        luong1 = new double[soluong];
        hoahong = new double[soluong];
        System.out.println("Menu");
        System.out.println("1.Nhan vien hành chinh ");
        System.out.println("2.Truong phong ");
        System.out.println("3.Nhan vien tiep thi ");
        System.out.println("Moi ban nhap loai nhan vien: ");
        choice1 = input.nextInt();
        switch (choice1) {
            case 1:
                for (int i = 0; i < soluong; i++) {
                    System.out.printf("Moi ban nhap ma nhan vien %d: ", i + 1);
                    ma[i] = input.nextLine();
                    System.out.printf("Moi ban nhap ten nhan vien %d: ", i + 1);
                    ten[i] = input.nextLine();
                    System.out.printf("Moi ban nhap email nhan vien %d: ", i + 1);
                    email[i] = input.nextLine();
                    System.out.printf("Moi ban nhap luong nhan vien %d: ", i + 1);
                    luong[i] = Double.parseDouble(input.nextLine());
                }
                break;
            case 2:
                for (int i = 0; i < soluong; i++) {
                    System.out.printf("Moi ban nhap ma nhan vien %d: ", i + 1);
                    ma[i] = input.nextLine();
                    System.out.printf("Moi ban nhap ten nhan vien %d: ", i + 1);
                    ten[i] = input.nextLine();
                    System.out.printf("Moi ban nhap email nhan vien %d: ", i + 1);
                    email[i] = input.nextLine();
                    System.out.printf("Moi ban nhap luong nhan vien %d: ", i + 1);
                    luong[i] = Double.parseDouble(input.nextLine());
                    System.out.printf("Moi ban nhap luong trach nhiem nhan vien %d: ", i + 1);
                    luong1[i] = Double.parseDouble(input.nextLine());
                }
                break;
            case 3:
                for (int i = 0; i < soluong; i++) {
                    System.out.printf("Moi ban nhap ma nhan vien %d: ", i + 1);
                    ma[i] = input.nextLine();
                    System.out.printf("Moi ban nhap ten nhan vien %d: ", i + 1);
                    ten[i] = input.nextLine();
                    System.out.printf("Moi ban nhap email nhan vien %d: ", i + 1);
                    email[i] = input.nextLine();
                    System.out.printf("Moi ban nhap luong nhan vien %d: ", i + 1);
                    luong[i] = Double.parseDouble(input.nextLine());
                    System.out.printf("Moi ban nhap luong hoa hong nhan vien %d: ", i + 1);
                    hoahong[i] = Double.parseDouble(input.nextLine());
                }
                break;
            default:
                System.out.println("Chuc nang ban chon khong ton tai");
                break;
        }
        System.out.println();
        menu();

    }

    static void bai2() {
        System.out.println("Xuat nhan vien: ");
        for (int i = 0; i < soluong; i++) {
            System.out.printf("Ma: %s | Ten: %s | Email: %s | Luong: %s \n", ma[i], ten[i], email[i], luong[i]);
            
        }
        System.out.println();
        menu();

    }

    static void bai3() {
        System.out.println("Moi ban nhap ma nhan vien");
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        for (int i = 0; i < soluong; i++) {
            if (ma[i].equalsIgnoreCase(code)) {
                System.out.println("Thong tin nhan vien can tim la: ");
                System.out.printf("Ma: %s | Ten: %s | Email: %s | Luong: %s \n", ma[i], ten[i], email[i], luong[i]);

            }
        }
        menu();

    }
}
