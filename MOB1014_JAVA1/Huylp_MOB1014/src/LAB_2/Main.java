/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1.Bai 1");
        System.out.println("2.Bai 2");
        System.out.println("3.Bai 3");
        System.out.println("4.Bai 4");
        System.out.println("5.Bai tap them 2");
        System.out.println("6.Bai tap them 3");
        System.out.print("Moi ban nhap lua chon: ");
        choice = input.nextInt();
        input.nextLine();
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
                System.exit(0);
                break;
            case 5:
                btthem2();
                break;
            case 6:
                btthem3();
                break;
            default:
                System.out.println("Chuc nang ban chon khong ton tai");
                break;
        }
    }

    public static void bai1() {
        try {
            Scanner input = new Scanner(System.in);
            int a, b;
            System.out.println("Moi ban nhap 2 he so a,b:");
            a = input.nextInt();
            b = input.nextInt();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }

            } else {
                System.out.printf("Nghiem la: x=%.1f", (float) -b / a);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ban nhap bi loi");
            System.out.println("Loi do" + e);
        }
    }

    public static void bai2() {
        try {
            int a, b, c;
            System.out.println("Moi ban nhap 3 he so a,b,c:");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phuong trinh vo so nghiem");

                    } else {
                        System.out.println("Phuong vo nghiem");
                    }

                } else {
                    System.out.printf("PT co nghiem: x=%.1f", (float) -c / b);
                }
            } else {
                int delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.print("PT VN");

                } else if (delta == 0) {
                    System.out.printf("PT co nghiem duy nhat x=%.1f", (float) (-b / 2 * a));

                } else {
                    float canDelta = (float) Math.sqrt(delta);
                    float x1 = (-b + canDelta) / (2 * a);
                    float x2 = (-b - canDelta) / (2 * a);
                    System.out.printf("x1 = %.1f; x2 =%.1f", x1, x2);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ban nhap bi loi");
            System.out.println("Loi do" + e);
        }
    }

    public static void bai3() {
        try {
            System.out.println("Moi ban nhap so dien su dung: ");
            Scanner input = new Scanner(System.in);
            double soDien;
            soDien = input.nextDouble();
            double tien = 0;
            if (soDien < 50) {
                tien = soDien * 100;

            } else {
                tien = 50 * 100 + (soDien - 50) * 1200;

            }
            System.out.printf("So tien la: %.1f", tien);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ban nhap bi loi");
            System.out.println("Loi do" + e);
        }

    }

    public static void btthem2() {
        Scanner input = new Scanner(System.in);
        int xu1, xu2, xu3, xu4, xu5, xu6, tong;
        System.out.println("So to 2$: ");
        xu1 = input.nextInt();
        System.out.println("So to 1$:");
        xu2 = input.nextInt();
        System.out.println("So to 50xu: ");
        xu3 = input.nextInt();
        System.out.println("So to 20xu: ");
        xu4 = input.nextInt();
        System.out.println("So to 10xu: ");
        xu5 = input.nextInt();
        System.out.println("So to 5xu: ");
        xu6 = input.nextInt();
        tong = (xu1 * 2) * 100 + (xu2 * 100) + (xu3 * 50) + (xu4 * 20) + (xu5 * 10) + (xu6 * 5);
        System.out.println("Tong tien la: " + tong);

    }

    public static void btthem3() {
        int sotienvay, laisuat, nam;
        double tongtien;
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien vay: ");
        sotienvay = input.nextInt();
        System.out.println("Moi ban nhap lai suat hang nam: ");
        laisuat = input.nextInt();
        System.out.println("Moi ban nhap so nam vay: ");
        nam = input.nextInt();
        tongtien = sotienvay * (1 + (laisuat * nam) / 100) / (12 * nam);
        System.out.printf("So tien ban phai tra trong 1 thang la: %.2fn", tongtien);

    }

}
