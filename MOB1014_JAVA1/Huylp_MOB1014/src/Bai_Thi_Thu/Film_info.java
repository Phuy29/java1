package Bai_Thi_Thu;

import java.util.Scanner;

public class Film_info {
    String tenFilm, hangFilm, email;
    int namSanXuat;
    double doanhThu;

    String regEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

    Scanner sc = new Scanner(System.in);

    public Film_info() {

    }

    public Film_info(String tenFilm, String hangFilm, String email, int namSanXuat, double doanhThu) {
        this.tenFilm = tenFilm;
        this.hangFilm = hangFilm;
        this.email = email;
        this.namSanXuat = namSanXuat;
        this.doanhThu = doanhThu;
    }

    public String getTenFilm() {
        return tenFilm;
    }

    public void setTenFilm(String tenFilm) {
        this.tenFilm = tenFilm;
    }

    public String getHangFilm() {
        return hangFilm;
    }

    public void setHangFilm(String hangFilm) {
        this.hangFilm = hangFilm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void Input_flim() {
        System.out.println("Nhap ten film: ");
        tenFilm = sc.nextLine();
        System.out.println("Nhap hang film: ");
        hangFilm = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap doanh thu: ");
        doanhThu = Double.parseDouble(sc.nextLine());
        do {
            System.out.println("Nhap email: ");
            email = sc.nextLine();
        } while (!email.matches(regEmail));
    }

    public void Output_film() {
        System.out.printf("Ten film: %s | Hang film: %s | Nam san xuat: %d | Doanh thu: %lf | Email: %s",tenFilm,hangFilm,namSanXuat,doanhThu,email);
    }

    public void xuatFilm() {
    }

    public int compareTo(Film_info max) {
        return 0;
    }

}
