package AccountManagement;
import AccountManagement.account.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("001", "Nguyen Van A", 1000);
        Account acc2 = new Account("002", "Le Thi B", 2000);

        acc1.hienThi();
        acc2.hienThi();

        acc1.napTien(500);
        acc1.hienThi();

        acc2.rutTien(300);
        acc2.hienThi();

        acc1.tinhLaiThang();
        acc1.hienThi();

        acc2.tinhLaiThang();
        acc2.hienThi();

    }
}
