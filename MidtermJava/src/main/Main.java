package main;

import model.vehicle.*;

public class Main {
    public static void main(String[] args) {
        PhuongTien oto1 = new OTo("OT001", "Toyota", 50000, "KhuyenMaiOTo");
        PhuongTien xemay1 = new XeMay("XM001", "Honda", 20000, "KhuyenMaiXeMay");  

        PhuongTien [] vehicles = {oto1, xemay1};

        int soGioThue = 5;
        for (PhuongTien pt : vehicles) {
            if (pt instanceof OTo) {
                ((OTo) pt).displayInfo(soGioThue);
            } else if (pt instanceof XeMay) {
                ((XeMay) pt).displayInfo(soGioThue);
            }
        }

    }
}
