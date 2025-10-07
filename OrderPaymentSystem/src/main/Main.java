package main;

import model.*;
import order.Order;
import payment.*;

public class Main {
    public static void main(String[] args) {
        Product phone = new ElectronicProduct("P001", "iPhone 15", 25000000, "IMEI123456", 12);
        Product milk = new FoodProduct("P002", "Vinamilk", 30000, "2025-12-01");

        Order order1 = new Order("Nguyễn Văn A", new CashPayment());
        order1.addProduct(phone);
        order1.addProduct(milk);
        order1.checkout();

        Order order2 = new Order("Nguyễn Văn B", new MomoPayment());
        order2.addProduct(milk);
        order2.checkout();
    }
}
