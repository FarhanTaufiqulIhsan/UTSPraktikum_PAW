package com.uts.uts.Hotel;

import java.sql.Date;

public class CustomerHotel {
    int No_KTP;
    String Nama;
    String Alamat;
    int Nomor_Kamar;
    Date waktuCheckin;
    Date waktuCheckout;
    double InformasiPembayaran;
    String pesananMakanan;

    public CustomerHotel(int No_KTP, String Nama, String Alamat, int Nomor_Kamar) {
        this.No_KTP = No_KTP;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Nomor_Kamar = Nomor_Kamar;
    }

    public void infoTamu() {
        System.out.println("No. KTP: " + No_KTP);
        System.out.println("Nama: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Nomor Kamar: " + Nomor_Kamar);
    }

    public void setCheckin(Date waktu) {
        this.waktuCheckin = waktu;
    }

    public void setCheckout(Date waktu) {
        this.waktuCheckout = waktu;
    }

    public void setPembayaran(double total) {
        this.InformasiPembayaran = total;
    }

    public void setPesananMakanan(String pesanan) {
        this.pesananMakanan = pesanan;
    }

    public void tampilkanInformasi() {
        System.out.println("Informasi Check-in: " + waktuCheckin);
        System.out.println("Informasi Check-out: " + waktuCheckout);
        System.out.println("Pesanan Makanan: " + pesananMakanan);
        System.out.println("Informasi Pembayaran: " + InformasiPembayaran);
    }
}
