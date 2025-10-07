package payment;

public class CreditPayment implements PaymentMethod{
    public void pay(double amount, String TenKH) {
        System.out.println("Khách hàng " + TenKH + ". Tổng tiền: " + amount + ". Thanh toán bằng thẻ tín dụng thành công");
    }
}
