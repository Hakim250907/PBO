package Pertemuan_9;

// SUBCLASS (kelas anak) dari Konsol -> Single Inheritance
public class PS4 extends Konsol {

    public PS4(int stok) {
        super("PS4", 5000, stok);   // memanggil constructor superclass
    }

    @Override
    public String getFasilitas() {
        // super.getFasilitas() = memanggil method milik superclass
        return super.getFasilitas() + " + controller DualShock 4, Full HD";
    }
}