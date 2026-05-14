package pekan6_2511532026;
import java.util.Scanner;

public class Musik_2511532026 {

    Lagu_2511532026 head_2026, tail_2026;

    public void tambahLagu_2026(String judul_2026, String penyanyi_2026) {
        Lagu_2511532026 baru_2026 = new Lagu_2511532026(judul_2026, penyanyi_2026);

        if (head_2026 == null)
            head_2026 = tail_2026 = baru_2026;
        else {
            tail_2026.next_2026 = baru_2026;
            baru_2026.prev_2026 = tail_2026;
            tail_2026 = baru_2026;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    public void hapusLaguAwal_2026() {
        if (head_2026 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("Lagu \"" + head_2026.judul_2026 + "\" dihapus.");

        if (head_2026 == tail_2026)
            head_2026 = tail_2026 = null;
        else {
            head_2026 = head_2026.next_2026;
            head_2026.prev_2026 = null;
        }
    }

    public void tampilMaju_2026() {
        if (head_2026 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("\n=== Playlist Maju ===");
        for (Lagu_2511532026 temp_2026 = head_2026; temp_2026 != null; temp_2026 = temp_2026.next_2026)
            System.out.println(temp_2026.judul_2026 + " - " + temp_2026.penyanyi_2026);
    }

    public void tampilMundur_2026() {
        if (tail_2026 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("\n=== Playlist Mundur ===");
        for (Lagu_2511532026 temp_2026 = tail_2026; temp_2026 != null; temp_2026 = temp_2026.prev_2026)
            System.out.println(temp_2026.judul_2026 + " - " + temp_2026.penyanyi_2026);
    }

    public void cariLagu_2026(String cari_2026) {
        for (Lagu_2511532026 temp_2026 = head_2026; temp_2026 != null; temp_2026 = temp_2026.next_2026) {
            if (temp_2026.judul_2026.equalsIgnoreCase(cari_2026)) {
                System.out.println("Lagu ditemukan!");
                System.out.println(temp_2026.judul_2026 + " - " + temp_2026.penyanyi_2026);
                return;
            }
        }

        System.out.println("Lagu tidak ditemukan!");
    }

    public static void main(String[] args) {
        Scanner input_2026 = new Scanner(System.in);
        Musik_2511532026 playlist_2026 = new Musik_2511532026();
        int pilih_2026;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511532026 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilih_2026 = input_2026.nextInt();
            input_2026.nextLine();

            switch (pilih_2026) {
                case 1:
                    System.out.print("Judul Lagu: ");
                    String judul_2026 = input_2026.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_2026 = input_2026.nextLine();
                    playlist_2026.tambahLagu_2026(judul_2026, penyanyi_2026);
                    break;

                case 2: playlist_2026.hapusLaguAwal_2026(); break;
                case 3: playlist_2026.tampilMaju_2026(); break;
                case 4: playlist_2026.tampilMundur_2026(); break;

                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    playlist_2026.cariLagu_2026(input_2026.nextLine());
                    break;

                case 6: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }

        } while (pilih_2026 != 6);

        input_2026.close();
    }
}