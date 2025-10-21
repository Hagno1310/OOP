package model.vehicle;
import model.promotion.KhuyenMai;

public class OTo extends PhuongTien implements KhuyenMai {
    private String LoaiPT = "OTo";    
    private String LoaiKM;

    public OTo(String MaPT, String Ten, double DonGia, String LoaiKM) {
        super(MaPT, Ten, DonGia);
        this.LoaiKM = LoaiKM;
    }

    @Override
    public double tinhTien(int soGio) {
        if (soGio > 3) {
            return DonGia * soGio + 20;
        } else {
            return DonGia * soGio;
        }
    }

    @Override
    public double apDung(double tienGoc) {
        if (LoaiKM.equals("KhuyenMaiOTo")) {
            return tienGoc - (tienGoc * 15 / 100);
        }
        return tienGoc;
    }

    public void displayInfo(int soGio) {
        double tienGoc = tinhTien(soGio);
        double tienSauKM = apDung(tienGoc);
        System.out.println("%s %s %s hours %.2fVND %.2fVND".formatted(LoaiPT, Ten, soGio, tienGoc, tienSauKM));
    }
    
}
