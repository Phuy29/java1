package Bai_Thi_Thu;

public class Film_007 extends Film_info {
    String Nam_chinh, Nu_chinh;
    Double tien_catse;

    public Film_007(){

    }

    public Film_007(String tenFilm, String hangFilm, String email, int namSanXuat, double doanhThu, String nam_chinh,
            String nu_chinh, Double tien_catse) {
        super(tenFilm, hangFilm, email, namSanXuat, doanhThu);
        this.Nam_chinh = nam_chinh;
        this.Nu_chinh = nu_chinh;
        this.tien_catse = tien_catse;
    }

    public String getNam_chinh() {
        return Nam_chinh;
    }

    public void setNam_chinh(String nam_chinh) {
        Nam_chinh = nam_chinh;
    }

    public String getNu_chinh() {
        return Nu_chinh;
    }

    public void setNu_chinh(String nu_chinh) {
        Nu_chinh = nu_chinh;
    }

    public Double getTien_catse() {
        return tien_catse;
    }

    public void setTien_catse(Double tien_catse) {
        this.tien_catse = tien_catse;
    }

    public void Input_flim() {
        super.Input_flim();
        System.out.println("Nhap nam chinh:");
        Nam_chinh = sc.nextLine();
        System.out.println("Nhap nu chinh:");
        Nu_chinh = sc.nextLine();
        System.out.println("Nhap tien castse: ");
        tien_catse = Double.parseDouble(sc.nextLine());
    }

    public void Output_film() {
        super.Output_film();
        System.out.printf("| Nam chinh: %s | Nu chinh: %s | Tien catse: %lf",Nam_chinh,Nu_chinh,tien_catse);
    }

}
