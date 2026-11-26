package Pertemuan_6;

public class Konsol {
    private final String jenis;
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
}