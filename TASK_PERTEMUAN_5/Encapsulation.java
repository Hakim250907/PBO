package TASK_PERTEMUAN_5;

import java.util.Scanner;

class Pelanggan {
    public String nama;
    public String noHP;

    public Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
}

class Konsol {
    public int hargasewa;
    public String jenis;
    public int stok;

    public Konsol(String jenis, int hargasewa, int stok) {
        this.jenis = jenis;
        this.hargasewa = hargasewa;
        this.stok = stok;
    }

    public void kurangiStok() {
        if (stok > 0) stok--;
    }
}

public class Encapsulation {
    static Scanner input = new Scanner(System.in);

    static int hitungDiskon(int durasi) {
        if (durasi > 5) return 10;
        else if (durasi > 3) return 5;
        return 0;
    }

    static long hitungTotal(int harga, int durasi) {
        int subtotal = harga * durasi;
        subtotal = subtotal - (subtotal * hitungDiskon(durasi) / 100);
        return subtotal + Math.round(subtotal * 0.10);
    }

    public static void main(String[] args) {
        System.out.print("Stok ps4: ");
        int stokps4 = input.nextInt();
        System.out.print("Stok ps5: ");
        int stokps5 = input.nextInt();
        input.nextLine();

        Konsol ps4 = new Konsol("ps4", 5000, stokps4);
        Konsol ps5 = new Konsol("ps5", 12000, stokps5);

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();
        System.out.print("No. Hp: ");
        String noHP = input.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama, noHP);

        System.out.println("1. ps4 5000/jam (Stok: " + ps4.stok + ")");
        System.out.println("2. ps5 12000/jam (Stok: " + ps5.stok + ")");
        System.out.print("Pilih Konsol: ");
        int pilihan = input.nextInt();

        Konsol konsol;
        switch (pilihan) {
            case 1 -> konsol = ps4;
            case 2 -> konsol = ps5;
            default -> {
                System.out.println("Pilihan Salah");
                input.close();
                return;
            }
        }

        System.out.print("Durasi (jam): ");
        int durasi = input.nextInt();
        if (durasi <= 0 || konsol.stok <= 0) {
            System.out.println("Durasi tidak valid");
            input.close();
            return;
        }

        long total = hitungTotal(konsol.hargasewa, durasi);
        konsol.kurangiStok();

        System.out.println("\nNama: " + pelanggan.nama);
        System.out.println("noHP: " + pelanggan.noHP);
        System.out.println("Konsol: " + konsol.jenis);
        System.out.println("Durasi: " + durasi + "jam");
        System.out.println("Total: Rp" + total);

        System.out.print("uang bayar: ");
        int bayar = input.nextInt();

        if (bayar >= total)
            System.out.println("Lunas, kembaliam Rp" + (bayar - total));
        else
            System.out.println("Belum Lunas, Kurang Rp" + (total - bayar));
        System.out.println("Sisa Stok: " + konsol.stok);
        input.close();
    }
}