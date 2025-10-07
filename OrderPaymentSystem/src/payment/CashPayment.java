package payment;

import java.text.DecimalFormat;

public class CashPayment implements PaymentMethod{

    DecimalFormat df = new DecimalFormat("#,###");

    public void pay(double amount, String TenKH) {
        System.out.println("Khách hàng " + TenKH + ". Tổng tiền: " + df.format(amount) + "đ. Thanh toán tiền mặt thành công");
    }
}
