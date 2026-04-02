package pekan1_2511532026;
import java.util.*;
public class Driver_2511532026 {
    public static void main(String[] args) {

        
        Mobil_2511532026[] daftarMobil = new Mobil_2511532026[10];
        int jumlah = 0;

      
        daftarMobil[jumlah++] = new Mobil_2511532026("McLaren", 2020, 1300, 150000000, "Toyota");
        daftarMobil[jumlah++] = new Mobil_2511532026("Lamborgini", 2022, 1500, 500000000, "Honda");

        System.out.println("=== DATA MOBIL (SETELAH TAMBAH) ===");
        for (int i = 0; i < jumlah; i++) {
            daftarMobil[i].tampilkanMobil();
        }

        
        int indexHapus = 0;
        for (int i = indexHapus; i < jumlah - 1; i++) {
            daftarMobil[i] = daftarMobil[i + 1];
        }
        jumlah--;

        System.out.println("=== DATA MOBIL (SETELAH HAPUS) ===");
        for (int i = 0; i < jumlah; i++) {
            daftarMobil[i].tampilkanMobil();
        }

      
        daftarMobil[0].setHarga(480000000);

        System.out.println("=== SETELAH UPDATE HARGA ===");
        daftarMobil[0].tampilkanMobil();
    }
}