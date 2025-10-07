package model;

public class FoodProduct extends Product {
    private String HanSD;

    public FoodProduct(String MaSP, String TenSP, double Gia, String HanSD) {
        super(MaSP, TenSP, Gia);
        this.HanSD = HanSD;
    }

    @Override
    public void displayInfo() {
        System.out.println("Điện tử: " + TenSP  + " - " + Gia + "đ");
        System.out.println("Hạn sử dụng: " + HanSD + " tháng");
    }

}