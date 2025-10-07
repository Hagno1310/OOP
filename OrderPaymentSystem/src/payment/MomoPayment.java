package payment;

public class MomoPayment implements PaymentMethod{
    public void pay(double amount, String TenKH) {
        System.out.println("Khách hàng " + TenKH + ". Tổng tiền: " + amount + ". Thanh toán qua Momo thành công");
    }
}
