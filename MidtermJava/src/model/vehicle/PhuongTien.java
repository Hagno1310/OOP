package model.vehicle;

public abstract class PhuongTien {
    protected String MaPT;
    protected String Ten;
    protected double DonGia;

    public PhuongTien(String MaPT, String Ten, double DonGia) {
        this.MaPT = MaPT;
        this.Ten = Ten;
        this.DonGia = DonGia;
    }

    public abstract double tinhTien(int soGio);
}