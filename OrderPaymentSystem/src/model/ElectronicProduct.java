package model;

public class ElectronicProduct extends Product {
    private String imei;
    private int ThoiGianBaoHanh;

    public ElectronicProduct(String MaSP, String TenSP, double Gia, String imei, int ThoiGianBaoHanh) {
        super(MaSP, TenSP, Gia);
        this.imei = imei;
        this.ThoiGianBaoHanh = ThoiGianBaoHanh;
    }

    @Override
    public void displayInfo() {
        System.out.println("Điện tử: " + TenSP  + " - " + Gia + "đ");
        System.out.println("IMEI: " + imei);
        System.out.println("Bảo hành: " + ThoiGianBaoHanh + " tháng");
    }

}