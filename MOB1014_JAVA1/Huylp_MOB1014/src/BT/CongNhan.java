package BT;

public class CongNhan extends NhanVien{
    public CongNhan(){

    }

    public CongNhan(String hoTen, String manv, String ngaySinh, Double lcb){
        super(hoTen,manv,ngaySinh,lcb);
    }

    @Override
    public void nhapNV(){
        super.nhapNV();
    }

    @Override
    public double getLuong() {
        return lcb * 1.5;
    }

    public void hienNV() {
        System.out.printf("Ho ten: %s | Ma nv: %s | Ngay sinh: %s | Luong cb: %lf | Luong: %.2f",hoTen,manv,ngaySinh,lcb,getLuong());
    }


}
