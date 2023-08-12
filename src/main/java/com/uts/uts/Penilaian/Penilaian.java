package com.uts.uts.Penilaian;

import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang;

        do {
            int[] nilaiArray = { 79, 99, 75, 92, 60, 45 };
            hitungDanTampilkanGrade(nilaiArray);

            System.out.print("Apakah Anda ingin mengulang program? (y/n): ");
            String pilihan = scanner.next();
            ulang = pilihan.equalsIgnoreCase("y");
        } while (ulang);

        scanner.close();
        System.out.println("Terima kasih telah menggunakan program penilaian.");
    }

    public static void hitungDanTampilkanGrade(int[] nilaiArray) {
        for (int nilai : nilaiArray) {
            String grade = "";

            if (nilai >= 80.00 && nilai <= 100) {
                grade = "A";
            } else if (nilai >= 77.50 && nilai <= 79.99) {
                grade = "A-";
            } else if (nilai >= 75.00 && nilai <= 77.49) {
                grade = "AB";
            } else if (nilai >= 72.50 && nilai <= 74.99) {
                grade = "B+";
            } else if (nilai >= 70.00 && nilai <= 72.49) {
                grade = "B";
            } else if (nilai >= 67.50 && nilai <= 69.99) {
                grade = "B-";
            } else if (nilai >= 65.00 && nilai <= 67.49) {
                grade = "BC";
            } else if (nilai >= 62.50 && nilai <= 64.99) {
                grade = "C+";
            } else if (nilai >= 60.00 && nilai <= 62.49) {
                grade = "C";
            } else if (nilai >= 55.00 && nilai <= 59.99) {
                grade = "C-";
            } else if (nilai >= 50.00 && nilai <= 54.99) {
                grade = "CD";
            } else if (nilai >= 45.00 && nilai <= 49.99) {
                grade = "D+";
            } else if (nilai >= 40.00 && nilai <= 44.99) {
                grade = "D";
            } else if (nilai < 40.00) {
                grade = "E";
            }

            System.out.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);
            System.out.println();
        }
    }
}
