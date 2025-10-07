package model;

public abstract class Product {
    protected String MaSP;
    protected String TenSP;
    protected double Gia;

    public Product(String MaSP, String TenSP, double Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
    }

    public double getPrice() {
        return Gia;
    }

    public abstract void displayInfo();
}
