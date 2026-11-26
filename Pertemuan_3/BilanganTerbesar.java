package Pertemuan_3;

import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan pertama: ");
            double bil1 = input.nextDouble();

            System.out.print("Masukkan bilangan kedua: ");
            double bil2 = input.nextDouble();

            if (bil1 > bil2) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else if (bil2 > bil1) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Kedua bilangan bernilai sama.");
            }
        }
    }
}