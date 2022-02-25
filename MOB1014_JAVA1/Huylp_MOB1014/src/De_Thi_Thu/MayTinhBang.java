package De_Thi_Thu;

public class MayTinhBang extends Laptop {
    double price;

    public MayTinhBang(String name,  Double version, String color, double price) {
        super(name, version, color);
        this.price = price;
    }
    
    public MayTinhBang() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap gia: ");
        price = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        super.xuat();
        System.out.println("Gia: " + price);
    }
}
