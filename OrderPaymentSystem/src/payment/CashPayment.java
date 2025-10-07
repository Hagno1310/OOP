package payment;

public class CashPayment implements PaymentMethod{
    public void pay(double amount, String TenKH) {
        System.out.println("Khách hàng " + TenKH + ". Tổng tiền: " + amount + ". Thanh toán tiền mặt thành công");
    }
}
