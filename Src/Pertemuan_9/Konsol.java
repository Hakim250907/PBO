package Pertemuan_9;

// SUPERCLASS (kelas induk): berisi atribut dan method yang umum untuk semua konsol.
public class Konsol {
    protected final String jenis;   // protected: bisa diakses oleh subclass (PS4 & PS5)
    private final int hargaSewa;
    private int stok;

    public Konsol(String jenis, int hargaSewa, int stok) {
        this.jenis = jenis;
        this.hargaSewa = hargaSewa;
        this.stok = stok;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    // Method ini akan di-OVERRIDE (ditimpa) oleh subclass
    public String getFasilitas() {
        return "Konsol standar";
    }

    // Method turunan: otomatis dimiliki oleh PS4 dan PS5 tanpa ditulis ulang (reuse kode)
    public String getInfo() {
        return jenis + " - Rp" + hargaSewa + "/jam (Stok: " + stok + ")";
    }
}
