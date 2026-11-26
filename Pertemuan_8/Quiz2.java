package Pertemuan_8;
import java.util.Scanner;

class Fruits {
    String nama;
    String warna;
    String rasa;

    void inputFruits(Scanner input) {
        System.out.print("Masukkan Nama Buah: ");
        nama = input.nextLine();

        System.out.print("Masukkan Warna: ");
        warna = input.nextLine();

        System.out.print("Masukkan Rasa: ");
        rasa = input.nextLine();
    }

    void tampilFruits() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Rasa: " + rasa);
    }
}

class Apple extends Fruits {
    void tampilApple() {
        System.out.println("\n=== DATA APEL ===");
        tampilFruits();
    }
}

class Banana extends Fruits {
    void tampilBanana() {
        System.out.println("\n=== DATA PISANG ===");
        tampilFruits();
    }
}

class Orange extends Fruits {
    void tampilOrange() {
        System.out.println("\n=== DATA JERUK ===");
        tampilFruits();
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Apple apel = new Apple();
        Banana pisang = new Banana();
        Orange jeruk = new Orange();

        System.out.println("=== INPUT DATA APEL ===");
        apel.inputFruits(input);

        System.out.println("\n=== INPUT DATA PISANG ===");
        pisang.inputFruits(input);

        System.out.println("\n=== INPUT DATA JERUK ===");
        jeruk.inputFruits(input);

        apel.tampilApple();
        pisang.tampilBanana();
        jeruk.tampilOrange();
    }
}
