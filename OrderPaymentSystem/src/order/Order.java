package order;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import payment.PaymentMethod;

public class Order {
    private String TenKH;
    private List<Product> products = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(String TenKH, PaymentMethod paymentMethod) {
        this.TenKH = TenKH;
        this.paymentMethod = paymentMethod;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void checkout() {
        double total = getTotal();
        paymentMethod.pay(total, TenKH);
    }
}
