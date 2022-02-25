package ASM_2;

public class NhanVienHanhChinh extends NhanVien {
    private double ngayCong;

    public NhanVienHanhChinh(String ID, String hoTen, double luongCoBan, String phongBan, double ngayCong){
        super(ID, hoTen, luongCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double ngayCong(){
        return ngayCong;
    }

    public void setngayCong(double ngayCong){
        this.ngayCong = ngayCong;
    }
    
    @Override
    double getLuong(){
        return luongCoBan;
    }


}
