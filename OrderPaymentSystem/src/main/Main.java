package main;

import model.*;
import order.Order;
import payment.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        List<Product> productList = new ArrayList<>();
        productList.add(new ElectronicProduct("P001", "iPhone 15", 25000000, "IMEI123456", 12));
        productList.add(new ElectronicProduct("P002", "Laptop Asus", 18000000, "IMEI654321", 24));
        productList.add(new FoodProduct("P003", "Vinamilk 1L", 30000, "2025-12-01"));
        productList.add(new FoodProduct("P004", "Bánh Oreo", 15000, "2025-06-15"));

        System.out.println("===== HỆ THỐNG QUẢN LÝ BÁN HÀNG =====");
        System.out.print("Nhập tên nhân viên thực hiện: ");
        String staffName = sc.nextLine();

        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();

        Order order = null;
        List<Product> selectedProducts = new ArrayList<>();
        while (true) {
            System.out.println("\nDanh sách sản phẩm có sẵn:");
            for (int i = 0; i < productList.size(); i++) {
                System.out.print((i + 1) + ". ");
                productList.get(i).displayInfo();
            }

            System.out.print("Chọn số thứ tự sản phẩm (0 để kết thúc chọn): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 0) break;
            if (choice >= 1 && choice <= productList.size()) {
                selectedProducts.add(productList.get(choice - 1));
                System.out.println("→ Đã thêm sản phẩm vào giỏ hàng!");
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        System.out.println("\nChọn phương thức thanh toán:");
        System.out.println("1. Tiền mặt");
        System.out.println("2. Thẻ tín dụng");
        System.out.println("3. Ví Momo");
        System.out.print("Nhập lựa chọn: ");
        int paymentChoice = sc.nextInt();

        PaymentMethod method;
        switch (paymentChoice) {
            case 1:
                method = new CashPayment();
                break;
            case 2:
                method = new CreditPayment();
                break;
            case 3:
                method = new MomoPayment();
                break;
            default:
                System.out.println("Phương thức thanh toán không hợp lệ. Mặc định: Tiền mặt.");
                method = new CashPayment();
        }

        order = new Order(customerName, method);
        for (Product p : selectedProducts) {
            order.addProduct(p);
        }

        System.out.println("\n===== HÓA ĐƠN THANH TOÁN =====");
        System.out.println("Nhân viên: " + staffName);
        order.checkout();

        sc.close();
    }
}
