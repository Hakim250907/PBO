package individu;
class buku {
    String judul;
    String penulis;
    int tahunTerbit;


buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
}

void tampilkaninfo() {
    System.out.println("=== Data Buku ===");
    System.out.println("Judul   : " + judul);
    System.out.println("penulis : " + penulis);
    System.out.println("tahunTerbit : " + tahunTerbit);
    }
}

public class soalQuiz1 {
    public static void main(String[] args) {
        buku satu = new buku("Aku anak ilang", "kimo", 2028);
        buku dua = new buku("Aku anak anak", "kiki", 2029);

        satu.tampilkaninfo();
        System.out.println();
        dua.tampilkaninfo();
    }
}