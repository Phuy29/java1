package BT_JAVA;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class using_flyobjject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<flying_object> lst = new ArrayList<flying_object>();
        int n;
        System.out.println("Nhap so luong chuyen bay: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            flying_object obj1 = new flying_object();
            obj1.nhap();
            lst.add(obj1);
        }
        for(flying_object f:lst){
            System.out.println("---Thong tin chuyen bay----");
            f.xuat();
        }
    }
    
}
