package ASM_2;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong(String ID, String hoTen, double luongCoBan, String phongBan, double luongTrachNhiem){
        super(ID, hoTen, luongCoBan, phongBan);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem(){
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    double getLuong(){
        return luongCoBan + luongTrachNhiem;
    }
    

}
