package LAB_5.Bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc: ");
        while (true) {
            System.out.println("Nhap so thuc: ");
            double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.println("Nhap tiep du lieu (Y/N): ");
            String choice = sc.nextLine();
            if (choice.equals("N")) {
                break;
            }

        }
    }

    public void hienThi() {
        for (Double item : list) {
            System.out.println("  " + item);
        }
    }

    public void tinhTong() {
        double tong = 0;
        for (Double item : list) {
            tong += item;
        }
        System.out.println("Tong: " + tong);
    }
}
