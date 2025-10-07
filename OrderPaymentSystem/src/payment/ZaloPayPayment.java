package payment;

import java.text.DecimalFormat;

public class ZaloPayPayment implements PaymentMethod {

    DecimalFormat df = new DecimalFormat("#,###");

    @Override
    public void pay(double amount, String TenKH) {
        System.out.println("Khách hàng " + TenKH + ". Tổng tiền: " + df.format(amount) + "đ. Thanh toán qua ZaloPay thành công");
    }
}