package Pertemuan_3;

import java.util.Scanner;

public class HitungDiskon {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan total belanja (Rp): ");
            double totalBelanja = input.nextDouble();

            double diskon;

            if (totalBelanja >= 500000) {
                diskon = 0.20;
            } else if (totalBelanja >= 250000) {
                diskon = 0.10;
            } else if (totalBelanja >= 100000) {
                diskon = 0.05;
            } else {
                diskon = 0.0;
            }

            double jumlahDiskon = totalBelanja * diskon;
            double totalBayar = totalBelanja - jumlahDiskon;

            System.out.println("Diskon (" + (int)(diskon * 100) + "%)       : Rp " + (long)jumlahDiskon);
            System.out.println("Total yang harus dibayar : Rp " + (long)totalBayar);
        }
    }
}