package individu_Quiz;
public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;

    public Mahasiswa(String nim, String nama, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        setNilaiTugas(nilaiTugas);
        setNilaiUTS(nilaiUTS);
        setNilaiUAS(nilaiUAS);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiTugas(int nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilaiTugas = nilai;
        } else {
            System.out.println("Nilai tugas tidak valid, harus 0 - 100");
        }
    }

    public void setNilaiUTS(int nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilaiUTS = nilai;
        } else {
            System.out.println("Nilai UTS tidak valid, harus 0 - 100");
        }
    }

    public void setNilaiUAS(int nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilaiUAS = nilai;
        } else {
            System.out.println("Nilai UAS tidak valid, harus 0 - 100");
        }
    }

    public double hitungNilaiAkhir() {
        return nilaiTugas * 0.5 + nilaiUTS * 0.4 + nilaiUAS * 0.4;
    }

    public String tentukanStatus() {
        if (hitungNilaiAkhir() >= 60) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public void tampilkanData() {
        System.out.println("=== HASIL PENILAIAN MAHASISWA ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println();
        System.out.printf("Nilai Akhir : %.2f\n", hitungNilaiAkhir());
        System.out.println("Status      : " + tentukanStatus());
    }
}