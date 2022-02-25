package ASM_2;

public class NhanVienTiepThi extends NhanVien {
    private double hueHong;
    
    public NhanVienTiepThi(String ID, String hoTen, double luongCoBan, String phongBan, double hueHong){
        super(ID, hoTen, luongCoBan, phongBan);
        this.hueHong = hueHong;
    }

    public double hueHong(){
        return hueHong;
    }

    public void sethueHong(double hueHong){
        this.hueHong = hueHong;
    }

    @Override
    double getLuong(){
        return luongCoBan + hueHong;
    }
}
