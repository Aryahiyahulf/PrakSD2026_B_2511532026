package pekan3_2511532026;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532026 {

    public static void main(String[] args) {

        Stack<Website_2511532026> history = new Stack<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511532026 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    Website_2511532026 web = new Website_2511532026(judul, url);
                    history.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        Website_2511532026 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul_2026());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        Website_2511532026 current = history.peek();
                        System.out.println("Halaman Aktif:");
                        System.out.println("Judul : " + current.getJudul_2026());
                        System.out.println("URL   : " + current.getUrl_2026());
                    } else {
                        System.out.println("Tidak ada halaman aktif.");
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah History: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}