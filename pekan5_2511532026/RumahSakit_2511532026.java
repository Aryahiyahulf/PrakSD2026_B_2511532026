package pekan5_2511532026;
import java.util.Scanner;

public class RumahSakit_2511532026 {
    private Pasien_2511532026 head_2026;
    private int counter_2026;

    public RumahSakit_2511532026() {
        head_2026 = null;
        counter_2026 = 0;
    }

    // Insert at tail
    public void daftarkanPasien_2026(String namaPasien_2026, String keluhan_2026) {
        counter_2026++;
        Pasien_2511532026 pasienBaru_2026 =
                new Pasien_2511532026(namaPasien_2026, keluhan_2026, counter_2026);

        if (head_2026 == null) {
            head_2026 = pasienBaru_2026;
        } else {
            Pasien_2511532026 bantu_2026 = head_2026;
            while (bantu_2026.getNext_2026() != null) {
                bantu_2026 = bantu_2026.getNext_2026();
            }
            bantu_2026.setNext_2026(pasienBaru_2026);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_2026);
    }

    // Delete head
    public void panggilPasien_2026() {
        if (head_2026 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Pasien dipanggil:");
        System.out.println("Nomor Antrian : " + head_2026.getNomorAntrian_2026());
        System.out.println("Nama          : " + head_2026.getNamaPasien_2026());
        System.out.println("Keluhan       : " + head_2026.getKeluhan_2026());

        head_2026 = head_2026.getNext_2026();
    }

    // Display
    public void tampilkanAntrian_2026() {
        if (head_2026 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511532026 bantu_2026 = head_2026;
        int posisi_2026 = 1;

        System.out.println("=== Daftar Antrian Pasien ===");

        while (bantu_2026 != null) {
            System.out.println("Posisi        : " + posisi_2026);
            System.out.println("Nomor Antrian : " + bantu_2026.getNomorAntrian_2026());
            System.out.println("Nama          : " + bantu_2026.getNamaPasien_2026());
            System.out.println("Keluhan       : " + bantu_2026.getKeluhan_2026());
            System.out.println("----------------------------");

            bantu_2026 = bantu_2026.getNext_2026();
            posisi_2026++;
        }
    }

    // Search
    public void cariPasien_2026(String namaCari_2026) {
        if (head_2026 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511532026 bantu_2026 = head_2026;
        boolean ditemukan_2026 = false;

        while (bantu_2026 != null) {
            if (bantu_2026.getNamaPasien_2026().equalsIgnoreCase(namaCari_2026)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("Nomor Antrian : " + bantu_2026.getNomorAntrian_2026());
                System.out.println("Nama          : " + bantu_2026.getNamaPasien_2026());
                System.out.println("Keluhan       : " + bantu_2026.getKeluhan_2026());
                ditemukan_2026 = true;
                break;
            }
            bantu_2026 = bantu_2026.getNext_2026();
        }

        if (!ditemukan_2026) {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

    // Status
    public void cekStatusAntrian_2026() {
        if (head_2026 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlah_2026 = 0;
        Pasien_2511532026 bantu_2026 = head_2026;

        while (bantu_2026 != null) {
            jumlah_2026++;
            bantu_2026 = bantu_2026.getNext_2026();
        }

        System.out.println("Jumlah pasien dalam antrian : " + jumlah_2026);
        System.out.println("Pasien terdepan             : " + head_2026.getNamaPasien_2026());
        System.out.println("Nomor antrian               : " + head_2026.getNomorAntrian_2026());
    }

    public static void main(String[] args) {
        Scanner input_2026 = new Scanner(System.in);
        RumahSakit_2511532026 rs_2026 = new RumahSakit_2511532026();

        int pilihan_2026;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532026 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilihan_2026 = input_2026.nextInt();
            input_2026.nextLine();

            switch (pilihan_2026) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_2026 = input_2026.nextLine();

                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_2026 = input_2026.nextLine();

                    rs_2026.daftarkanPasien_2026(nama_2026, keluhan_2026);
                    break;

                case 2:
                    rs_2026.panggilPasien_2026();
                    break;

                case 3:
                    rs_2026.tampilkanAntrian_2026();
                    break;

                case 4:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String cari_2026 = input_2026.nextLine();
                    rs_2026.cariPasien_2026(cari_2026);
                    break;

                case 5:
                    rs_2026.cekStatusAntrian_2026();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan_2026 != 6);

        input_2026.close();
    }
}