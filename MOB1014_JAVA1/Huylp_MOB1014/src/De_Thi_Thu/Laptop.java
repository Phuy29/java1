package De_Thi_Thu;

import java.util.Scanner;

public class Laptop {
    private String name, color;
    private double version;
    

    Scanner sc = new Scanner(System.in);

    public Laptop() {

    }

    public Laptop(String name, Double version, String color) {
        this.name = name;
        this.version = version;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void nhap() {
        System.out.println("===Nhap danh sach laptop===");
        System.out.println("Nhap ten laptop: ");
        name = sc.nextLine();
        System.out.println("Nhap version laptop: ");
        version = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap mau laptop: ");
        color = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten laptop: " + name);
        System.out.println("Ma laptop: " + version);
        System.out.println("Mau laptop: " + color);
    }
}
