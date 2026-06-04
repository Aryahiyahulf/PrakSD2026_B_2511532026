package pekan8_2511532026;

public class Sorting_2511532026 {

    Lagu_2511532026[] dataLagu_2026 = new Lagu_2511532026[20];
    int jumlahData_2026 = 0;

    public void inputData_2026() {
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Hati-Hati di Jalan", "Tulus", 240);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Komang", "Raim Laode", 210);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Sial", "Mahalini", 230);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Melukis Senja", "Budi Doremi", 250);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Monokrom", "Tulus", 220);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Evaluasi", "Hindia", 260);
        dataLagu_2026[jumlahData_2026++] = new Lagu_2511532026("Rumah ke Rumah", "Hindia", 200);
    }

    public void tampilData_2026() {
        for (int i = 0; i < jumlahData_2026; i++) {
            System.out.println((i + 1) + ". "
                    + dataLagu_2026[i].judul_2026 + " - "
                    + dataLagu_2026[i].durasi_2026 + " detik");
        }
    }

    public int partition_2026(int low_2026, int high_2026) {
        int pivot_2026 = dataLagu_2026[high_2026].durasi_2026;
        int i_2026 = low_2026 - 1;

        for (int j_2026 = low_2026; j_2026 < high_2026; j_2026++) {
            if (dataLagu_2026[j_2026].durasi_2026 < pivot_2026) {
                i_2026++;

                Lagu_2511532026 temp_2026 = dataLagu_2026[i_2026];
                dataLagu_2026[i_2026] = dataLagu_2026[j_2026];
                dataLagu_2026[j_2026] = temp_2026;
            }
        }

        Lagu_2511532026 temp_2026 = dataLagu_2026[i_2026 + 1];
        dataLagu_2026[i_2026 + 1] = dataLagu_2026[high_2026];
        dataLagu_2026[high_2026] = temp_2026;

        return i_2026 + 1;
    }

    public void quickSort_2026(int low_2026, int high_2026) {
        if (low_2026 < high_2026) {
            int pi_2026 = partition_2026(low_2026, high_2026);

            quickSort_2026(low_2026, pi_2026 - 1);
            quickSort_2026(pi_2026 + 1, high_2026);
        }
    }

    public static void main(String[] args) {

        Sorting_2511532026 playlist_2026 = new Sorting_2511532026();

        playlist_2026.inputData_2026();

        System.out.println("=== Sorting Playlist NIM: 2511532026 ===");
        System.out.println("\nData Sebelum Sorting:");
        playlist_2026.tampilData_2026();

        playlist_2026.quickSort_2026(0, playlist_2026.jumlahData_2026 - 1);

        System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
        playlist_2026.tampilData_2026();
    }
}