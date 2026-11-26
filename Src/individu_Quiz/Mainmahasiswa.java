package individu_Quiz;
import java.util.Scanner;

public class Mainmahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIM         : ");
        String nim = input.nextLine();
        System.out.print("Nama        : ");
        String nama = input.nextLine();
        System.out.print("Nilai Tugas : ");
        int tugas = input.nextInt();
        System.out.print("Nilai UTS   : ");
        int uts = input.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas = input.nextInt();

        Mahasiswa mhs = new Mahasiswa(nim, nama, tugas, uts, uas);

        System.out.println();
        mhs.tampilkanData();
    }
}