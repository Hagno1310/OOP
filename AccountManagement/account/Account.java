package AccountManagement.account;

public class Account {
    private String soTK;
    private String chuTK;
    private double soDu;
    private static double laiSuat = 0.05; // 5% mặc định

    public Account(String soTK, String chuTK, double soDu) {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công " + soTien + " vào tài khoản " + soTK);
        } else {
            System.out.println("Số tiền nạp phải > 0");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " từ tài khoản " + soTK);
        } else {
            System.out.println("Rút thất bại. Số dư không đủ!");
        }
    }

    public void tinhLaiThang() {
        double laiThang = soDu * (laiSuat / 12);
        soDu += laiThang;
    }

    public void hienThi() {
        System.out.printf("STK: %s | Chủ TK: %s | Số dư: %.2f\n", soTK, chuTK, soDu);
    }

    public double getSoDu() {
        return soDu;
    }

    public String getSoTK() {
        return soTK;
    }

    public static void setLaiSuat(double ls) {
        if (ls > 0) {
            laiSuat = ls;
        }
    }

    public static double getLaiSuat() {
        return laiSuat;
    }
}