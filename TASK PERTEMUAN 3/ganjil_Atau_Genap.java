package pertemuanke3;

import java.util.Scanner;

public class ganjil_Atau_Genap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah bilangan: ");
            int angka = input.nextInt();

            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan GENAP");
            } else {
                System.out.println(angka + " adalah bilangan GANJIL");
            }
        }
    }
}