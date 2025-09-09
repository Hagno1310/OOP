import java.util.Scanner;

public class SinhVien {
    private String MaSV;
    private String HoTen;
    private String Tuoi;

    private static int count = 0;

    // Getter count
    public static int getCount() {
        return count;
    }

    // Constructor
    public SinhVien(String MaSV, String HoTen, String Tuoi) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        count++;
    }

    // Thông tin sinh viên
    public String Bio() {
        return "MaSV: " + MaSV + ", HoTen: " + HoTen + ", Tuoi: " + Tuoi;
    }   

    public static void main(String[] args) {
        System.out.print("Ban muon nhap bao nhieu sinh vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("MaSV: ");
            String MaSV = sc.next();

            sc.nextLine();

            System.out.print("HoTen: ");
            String HoTen = sc.nextLine();

            System.out.print("Tuoi: ");
            String Tuoi = sc.next();

            SinhVien sv = new SinhVien(MaSV, HoTen, Tuoi);

            System.out.println("Thong tin sinh vien vua nhap: " + sv.Bio());
            System.out.println("Tong so sinh vien hien tai: " + SinhVien.getCount());
        }
        sc.close();
    };
};



