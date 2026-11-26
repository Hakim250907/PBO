import java.util.Scanner;
public class luas_Tabung {
    public static void main(String[] args) {
            System.out.println("Program tabung");

            try (Scanner input = new Scanner(System.in)) {

                System.out.print("Masukkan Jarijari: ");
                double Jarijari = input.nextDouble();

                System.out.print("Masukkan Tinggi: ");
                double Tinggi = input.nextDouble();

                double luasPermukaan = 2 * Math.PI * Jarijari * (Jarijari + Tinggi);

                System.out.println("Hasil tabung: ");
                System.out.printf("Hasil dari luas tabung: %.2f\n", luasPermukaan);
        }
    }   
}