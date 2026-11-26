package Pertemuan_3;

import java.util.Scanner;

public class TentukanHari {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kode hari (0-6): ");
            int kode = input.nextInt();

            switch (kode) {
                case 0 -> System.out.println("Kode " + kode + " adalah hari Minggu");
                case 1 -> System.out.println("Kode " + kode + " adalah hari Senin");
                case 2 -> System.out.println("Kode " + kode + " adalah hari Selasa");
                case 3 -> System.out.println("Kode " + kode + " adalah hari Rabu");
                case 4 -> System.out.println("Kode " + kode + " adalah hari Kamis");
                case 5 -> System.out.println("Kode " + kode + " adalah hari Jumat");
                case 6 -> System.out.println("Kode " + kode + " adalah hari Sabtu");
                default -> System.out.println("Kode tidak valid! Harap masukkan angka 0 - 6.");
            }
        }
    }
}