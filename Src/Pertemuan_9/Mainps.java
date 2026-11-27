package Pertemuan_9;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainPs {
    static Scanner input = new Scanner(System.in);

    static int hitungDiskon(int durasi) {
        if (durasi > 5) {
            return 10;
        } else if (durasi >= 3) {
            return 5;
        }
        return 0;
    }

    static long hitungTotal(int harga, int durasi) {
        int subtotal = harga * durasi;
        int diskon = subtotal * hitungDiskon(durasi) / 100;
        int setelahDiskon = subtotal - diskon;

        return setelahDiskon + Math.round(setelahDiskon * 0.10);
    }

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH.mm");

        System.out.println("=== RENTAL PLAYSTATION ===");
        System.out.println("Jam buka   : 10.00");
        System.out.println("Jam tutup  : 22.00");
        System.out.println("--------------------------");

        System.out.print("Stok PS4: ");
        int stokps4 = input.nextInt();

        System.out.print("Stok PS5: ");
        int stokps5 = input.nextInt();
        input.nextLine();

        // Inheritance: objek dibuat dari SUBCLASS (PS4/PS5), disimpan di variabel bertipe SUPERCLASS (Konsol)
        Konsol ps4 = new PS4(stokps4);
        Konsol ps5 = new PS5(stokps5);

        System.out.print("Nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("No. HP: ");
        String noHp = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, noHp);

        // getInfo() dipakai dari superclass Konsol oleh PS4 dan PS5
        System.out.println("\n1. " + ps4.getInfo());
        System.out.println("2. " + ps5.getInfo());

        System.out.print("Pilih konsol: ");
        int pilihan = input.nextInt();

        Konsol konsol;

        switch (pilihan) {
            case 1 -> konsol = ps4;
            case 2 -> konsol = ps5;
            default -> {
                System.out.println("Pilihan salah!");
                input.close();
                return;
            }
        }

        System.out.print("Jam mulai bermain (10-21): ");
        int jamMulai = input.nextInt();

        System.out.print("Durasi bermain (jam): ");
        int durasi = input.nextInt();

        if (durasi <= 0 || jamMulai < 10 || jamMulai >= 22 || konsol.getStok() <= 0) {
            System.out.println("Input tidak valid atau stok habis!");
            input.close();
            return;
        }

        LocalTime mulai = LocalTime.of(jamMulai, 0);
        LocalTime selesai = mulai.plusHours(durasi);

        if (jamMulai + durasi > 22) {
            System.out.println("Penyewaan melewati jam tutup!");
            System.out.println("Rental hanya buka pukul 10.00-22.00.");
            input.close();
            return;
        }

        int subtotal = konsol.getHargaSewa() * durasi;
        int diskon = hitungDiskon(durasi);
        int jumlahDiskon = subtotal * diskon / 100;
        int setelahDiskon = subtotal - jumlahDiskon;
        long ppn = Math.round(setelahDiskon * 0.10);
        long total = hitungTotal(konsol.getHargaSewa(), durasi);

        konsol.kurangiStok();

        System.out.println("\n=== STRUK PENYEWAAN ===");
        System.out.println("Nama        : " + pelanggan.getNama());
        System.out.println("No. HP      : " + pelanggan.getNoHp());
        System.out.println("Konsol      : " + konsol.getJenis());
        System.out.println("Fasilitas   : " + konsol.getFasilitas()); // method hasil override di PS4/PS5
        System.out.println("Durasi      : " + durasi + " jam");
        System.out.println("Mulai       : " + mulai.format(format));
        System.out.println("Waktu habis : " + selesai.format(format));
        System.out.println("Subtotal    : Rp" + subtotal);
        System.out.println("Diskon (" + diskon + "%): Rp" + jumlahDiskon);
        System.out.println("PPN (10%)   : Rp" + ppn);
        System.out.println("Total       : Rp" + total);

        System.out.print("\nUang bayar: ");
        int bayar = input.nextInt();

        if (bayar >= total) {
            System.out.println("LUNAS, kembalian Rp" + (bayar - total));
        } else {
            System.out.println("BELUM LUNAS, kurang Rp" + (total - bayar));
        }

        System.out.println("Sisa stok   : " + konsol.getStok());

        System.out.println("\n=== INFORMASI PEMILIK ===");
        System.out.println("Pelanggan harus selesai bermain pukul " + selesai.format(format));

        if (selesai.equals(LocalTime.of(22, 0))) {
            System.out.println("Waktu bermain berakhir tepat saat rental tutup.");
        }

        input.close();
    }
}