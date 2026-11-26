package Pertemuan_8;
import java.util.Scanner;

// SUPERCLASS (Tingkat 1)
class Person {
    String nama;
    int umur;

    void inputPerson(Scanner input) {
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        umur = input.nextInt();
        input.nextLine();
    }

    void tampilPerson() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

// SUBCLASS 1 (Tingkat 2: mewarisi Person)
class Student extends Person {
    String jurusan;

    void inputStudent(Scanner input) {
        System.out.print("Masukkan Jurusan: ");
        jurusan = input.nextLine();
    }

    void tampilStudent() {
        System.out.println("Jurusan: " + jurusan);
    }
}

// SUBCLASS 2 (Tingkat 3: mewarisi Student)
class CollegeStudent extends Student {
    String universitas;

    void inputCollege(Scanner input) {
        System.out.print("Masukkan Universitas: ");
        universitas = input.nextLine();
    }

    void tampilCollege() {
        System.out.println("Universitas: " + universitas);
    }
}

// MAIN CLASS
public class Quiz3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            CollegeStudent mahasiswa = new CollegeStudent();

            System.out.println("=== INPUT DATA MAHASISWA ===");
            mahasiswa.inputPerson(input);
            mahasiswa.inputStudent(input);
            mahasiswa.inputCollege(input);

            System.out.println("\n=== HASIL DATA MAHASISWA ===");
            mahasiswa.tampilPerson();
            mahasiswa.tampilStudent();
            mahasiswa.tampilCollege();
        }
    }
}