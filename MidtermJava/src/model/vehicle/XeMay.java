package model.vehicle;
import model.promotion.KhuyenMai;

public class XeMay extends PhuongTien implements KhuyenMai {
    private double PhuThu = 5;
    private String LoaiPT = "XeMay";    
    private String LoaiKM;

    public XeMay(String MaPT, String Ten, double DonGia, String LoaiKM) {
        super(MaPT, Ten, DonGia);
        this.LoaiKM = LoaiKM;
    }

    @Override
    public double tinhTien(int soGio) {
        return DonGia * soGio + PhuThu;
    }

    @Override
    public double apDung(double tienGoc) {
        if (LoaiKM.equals("KhuyenMaiXeMay")) {
            return tienGoc - (tienGoc * 10 / 100);
        }
        return tienGoc;
    }

    public void displayInfo(int soGio) {
        double tienGoc = tinhTien(soGio);
        double tienSauKM = apDung(tienGoc);
        System.out.println("%s %s %s hours %.2fVND %.2fVND".formatted(LoaiPT, Ten, soGio, tienGoc, tienSauKM));
    }

}
