package LAB_3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int choice;
            System.out.println("Menu");
            System.out.println("1.Bai 1");
            System.out.println("2.Bai 2");
            System.out.println("3.Bai 3");
            System.out.println("Moi ban chon bai: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    btthem();
                    break;
                case 6:
                    btthem1();
                    break;
                case 7:
                    btthem2();
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong ton tai");
                    break;
            }
        }
    }

    public static void bai1() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = input.nextInt();
        Boolean x = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                x = false;
                break;
            }
        }
        if (x == true) {
            System.out.printf("%d la so nguyen to \n", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to \n", n);
        }
    }

    public static void bai2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void bai3() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap so luong: ");
        n = input.nextInt();
        int mang1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Moi ban nhap so nguyen [%d]:", i + 1);
            mang1[i] = input.nextInt();
        }
        Arrays.sort(mang1);
        System.out.println("Mang da sap xep la: " + Arrays.toString(mang1));

        int min = mang1[0];
        for (int i = 0; i < mang1.length; i++) {
            if (min > mang1[i]) {
                min = mang1[i];
            }

        }
        System.out.println("So nguyen min la: " + min);

        float count = 0;
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (mang1[i] % 3 == 0) {
                tong += mang1[i];
                count++;
            }
        }
        float avg = (float) tong / count;
        System.out.println("Trung binh cac so chia het cho 3 la: " + avg);
    }

    public static void bai4() {
        Scanner input = new Scanner(System.in);
        String sv[] = new String[4];
        float diemSV[] = new float[4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nhap ten sinh vien [%d]: ", i + 1);
            sv[i] = input.nextLine();
            System.out.printf("Nhap diem sinh vien [%d]: ", i + 1);
            diemSV[i] = input.nextFloat();
            input.nextLine();
        }
        System.out.println("Mang sinh vien: " + Arrays.toString(sv));
        System.out.println("Mang diem sinh vien: " + Arrays.toString(diemSV));

        sortSV(sv, diemSV);
        for (int i = 0; i < sv.length; i++) {
            System.out.println("Ho ten: " + sv[i]);
            System.out.println("Diem: " + diemSV[i]);
            if (diemSV[i] >= 9) {
                System.out.println("Xuat sac");

            } else if (diemSV[i] >= 7.5) {
                System.out.println("Gioi");
            } else if (diemSV[i] >= 6.5) {
                System.out.println("Kha");
            } else if (diemSV[i] >= 5) {
                System.out.println("Trung binh");
            } else {
                System.out.println("Yeu");
            }
            System.out.println();

        }
    }

    public static void sortSV(String sv[], float diemSV[]) {
        for (int i = 0; i < sv.length - 1; i++) {
            for (int j = i + 1; j < sv.length; j++) {
                if (diemSV[i] > diemSV[j]) {
                    float temp = diemSV[i];
                    diemSV[i] = diemSV[j];
                    diemSV[j] = temp;
                    String svTemp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = svTemp;
                }
            }
        }
    }

    public static void btthem() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap so luong: ");
        n = input.nextInt();
        int mang[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Moi ban nhap so nguyen [%d]:", i + 1);
            mang[i] = input.nextInt();
        }

        int max = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la:" + max);

        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += mang[i];
        }
        System.out.println("Tong phan tu trong mang la: " + tong);
    }

    public static void btthem1() {
        Scanner input = new Scanner(System.in);
        int id, nv1, nv2, nv3, tong;
        System.out.println("Moi ban nhap id: ");
        id = input.nextInt();
        System.out.println("Moi ban nhap so ngay lam viec nv he thong: ");
        nv1 = input.nextInt();
        System.out.println("Moi ban nhap so ngay lam viec nv lap trinh: ");
        nv2 = input.nextInt();
        System.out.println("Moi ban nhap so ngay nv quan tri van phong: ");
        nv3 = input.nextInt();
        tong = (115 * nv1) + (120 * nv2) + (100 * nv3);
        System.out.println("Tong chi phi la: " + tong);
    }

    public static void btthem2() {
        Scanner input = new Scanner(System.in);
        int soluong;
        double time;
        System.out.println("Moi ban nhap so luong banh: ");
        soluong = input.nextInt();
        System.out.println("Moi ban nhap thoi gian giao hang (phut): ");
        time = input.nextDouble();
        if (time < 10) {
            System.out.println("Gia banh la: $5.5/1c");
        } else if (time > 10 && time < 20) {
            System.out.println("Gia banh la: $4/1c");
        } else if (time > 20 && time < 30) {
            System.out.println("Gia banh la: $2.5/1c");
        } else if (time > 30) {
            System.out.println("Ban khong phai tra tien");
        }

    }
}
