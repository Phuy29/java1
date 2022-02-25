package LAB_5.Bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSach {
    private ArrayList<String> ds = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach ho ten: ");
        while (true) {
            System.out.println("Nhap ho ten: ");
            String ten = sc.nextLine();
            if (ten.equals("")) {
                System.out.println("Nhap du lieu da xong");
                break;
            }
            ds.add(ten);
        }
    }

    public void xuat() {
        System.out.println("----------------");
        for (String item : ds) {
           System.out.println("" + item); 
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(ds);
        xuat();
    }

    public void sapXep() {
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }

    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten mmuon xoa: ");
        String ten = sc.nextLine();
        for (String item : ds) {
            if (item.equals(ten)) {
                ds.remove(item);
                System.out.println("Xoa ho ten thang cong");
                break;
            }
        }
    }

    public void menu() {
       Scanner sc = new Scanner(System.in);
       int choice;
       do {
           System.out.println("Menu");
           System.out.println("1.Nhap danh sach ho ten");
           System.out.println("2.Hienn thi danh sach ho ten");
           System.out.println("3.Sap xep ngau nhien");
           System.out.println("4.Sap xep");
           System.out.println("5.Xoa");
           System.out.println("0.Thoat");
           System.out.println("Moi ban chon chuc nang:");
           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   nhap();
                   break;
               case 2:
                   xuat();
                   break;
               case 3:
                   xuatNgauNhien();
                   break;
               case 4:
                   sapXep();
                   break;
               case 5:
                   xoa();
                   break;
               case 0:
                   break;
               default:
                   break;
           }
       } while (choice != 0); 
    }
}
