package Pertemuan_8;
import java.util.Scanner;

// SUPERCLASS
class Employee {
    String nama;
    int gaji;

    void inputData(Scanner input) {
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Gaji: ");
        gaji = input.nextInt();
        input.nextLine();
    }

    void tampilData() {
        System.out.println("Nama: " + nama + " | Gaji: Rp" + gaji);
    }
}

// SUBCLASS 1
class Manager extends Employee {
    String departemen;

    @Override
    void inputData(Scanner input) {
        super.inputData(input);
        System.out.print("Masukkan Departemen: ");
        departemen = input.nextLine();
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Departemen: " + departemen);
    }
}

// SUBCLASS 2
class Supervisor extends Employee {
    String divisi;

    @Override
    void inputData(Scanner input) {
        super.inputData(input);
        System.out.print("Masukkan Divisi: ");
        divisi = input.nextLine();
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Divisi: " + divisi);
    }
}

// MAIN CLASS
public class Quiz1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Manager mgr = new Manager();
            System.out.println("=== INPUT MANAGER ===");
            mgr.inputData(input);

            Supervisor spv = new Supervisor();
            System.out.println("\n=== INPUT SUPERVISOR ===");
            spv.inputData(input);

            System.out.println("\n=== HASIL DATA ===");
            mgr.tampilData();
            spv.tampilData();
        }
    }
}