package BT;

public class KySu extends NhanVien{
    String email, skill;
    String regEmail = "^\\w+@\\gmail.\\$";

    public KySu(){

    }

    public KySu(String email, String skill) {
        this.email = email;
        this.skill = skill;
    }

    public KySu(String hoTen, String manv, String ngaySinh, Double lcb, String email, String skill) {
        super(hoTen, manv, ngaySinh, lcb);
        this.email = email;
        this.skill = skill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        if (!email.matches(regEmail)) {
            System.out.println("Du lieu khong dung dinh dang");
        }
        System.out.println("Nhap ky nang: ");
        skill = sc.nextLine();
    }

    @Override
    double getLuong(){
        return lcb * 2.5;
    }
    
    public void hienNV() {
        System.out.printf("Ho ten: %s | Ma nv: %s | Ngay sinh: %s | Luong cb: %lf | Email: %s | Skill: %s | Luong: %.2f",hoTen,manv,ngaySinh,lcb,email,skill,getLuong());
    }

}
