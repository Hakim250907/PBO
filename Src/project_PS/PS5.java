package project_PS;

// SUBCLASS (kelas anak) dari Konsol -> bersama PS4 membentuk Hierarchical Inheritance
public class PS5 extends Konsol {

    public PS5(int stok) {
        super("PS5", 10000, stok);  // memanggil constructor superclass
    }

    @Override
    public String getFasilitas() {
        // "jenis" bisa dipakai langsung karena bersifat protected di Konsol
        return super.getFasilitas() + " + controller DualSense, 4K, SSD super cepat (" + jenis + ")";
    }
}
