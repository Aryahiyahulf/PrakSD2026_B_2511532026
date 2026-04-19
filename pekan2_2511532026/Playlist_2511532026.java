package pekan2_2511532026;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532026 {
    public static void main(String[] args) {
        ArrayList<Musik_2511532026> playlist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511532026 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();

                    Musik_2511532026 lagu = new Musik_2511532026(judul, penyanyi, durasi);
                    playlist.add(lagu);

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.println("\nDaftar Lagu:");
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511532026 m = playlist.get(i);
                            System.out.println((i + 1) + ". " +
                                    m.getJudul_2511532026() + " - " +
                                    m.getPenyanyi_2511532026() +
                                    " (" + m.getDurasi_2511532026() + " detik)");
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = input.nextInt();

                        if (index > 0 && index <= playlist.size()) {
                            playlist.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}