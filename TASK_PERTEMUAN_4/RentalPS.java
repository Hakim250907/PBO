package TASK_PERTEMUAN_4;
import java.util.Scanner;

// SISTEM PENYEWAAN PS4 / PS5
// Pertemuan 2: Tipe Data, Variabel, Method, Ekspresi
// Pertemuan 3: Control Statement (if-else, switch)
// Pertemuan 4: Function dan Parameter

public class RentalPS {
    static Scanner input = new Scanner(System.in);

    static String inputTeks(String pesan) {
        System.out.print(pesan);
        return input.nextLine();
    }

    static int inputAngka(String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }

    static int hitungDiskon(int durasi) {
        if (durasi >= 5) return 10;
        else if (durasi >= 3) return 5;
        else return 0;
    }

    static long hitungTotal(int harga, int durasi) {
        double pajak = 0.10;
        int subtotal = harga * durasi;
        subtotal = subtotal - (subtotal * hitungDiskon(durasi) / 100);
        return subtotal + Math.round(subtotal * pajak);
    }

    static void kurangiStok(int[] stok, int indeks) {
        stok[indeks]--;
    }

    static void tampilkanStruk(String nama, String jenis, int durasi, long total) {
        System.out.printf("\n%s %s %d jam | Total Rp%d\n", nama, jenis, durasi, total);
    }

    public static void main(String[] args) {
        final int HARGA_PS4 = 5000, HARGA_PS5 = 10000;
        int[] stok = new int[2];
        stok[0] = inputAngka("Stok PS4: ");
        stok[1] = inputAngka("Stok PS5: ");
        input.nextLine(); // Membersihkan buffer newline

        String jenis;
        int harga;
        String nama = inputTeks("Nama pelanggan: ");
        int pilihan = inputAngka("Pilih (1=PS4, 2=PS5): ");

        switch (pilihan) {
            case 1 -> { jenis = "PS4"; harga = HARGA_PS4; }
            case 2 -> { jenis = "PS5"; harga = HARGA_PS5; }
            default -> { System.out.println("Pilihan salah!"); return; }
        }

        int durasi = inputAngka("Durasi (jam): ");
        if (durasi <= 0 || stok[pilihan - 1] == 0) {
            System.out.println("Durasi tidak valid / stok habis!");
            return;
        }

        long total = hitungTotal(harga, durasi);
        kurangiStok(stok, pilihan - 1);
        tampilkanStruk(nama, jenis, durasi, total);

        int bayar = inputAngka("Uang bayar: ");
        boolean lunas = bayar >= total;
        if (lunas) {
            System.out.println("LUNAS, kembalian Rp" + (bayar - total));
        } else {
            System.out.println("BELUM LUNAS, kurang Rp" + (total - bayar));
        }
        System.out.println("Sisa stok " + jenis + " : " + stok[pilihan - 1]);
    }
}