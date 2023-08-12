package com.uts.uts.Hotel;

import java.sql.Date;

public class AppHotel {
    public static void main(String[] args) {
        var customer1 = new CustomerHotel(12312231, "Farhan", "Jalan Piere Tendean", 101);
        System.out.println("Info Tamu");
        System.out.println("===================================================");
        customer1.infoTamu();
        customer1.setCheckin(new Date(System.currentTimeMillis()));
        customer1.setCheckout(new Date(System.currentTimeMillis() + 86400000));
        customer1.setPesananMakanan("Nasi Goreng, Es Teh");
        customer1.setPembayaran(10000);
        customer1.tampilkanInformasi();
        System.out.println("===================================================");

    }
}
