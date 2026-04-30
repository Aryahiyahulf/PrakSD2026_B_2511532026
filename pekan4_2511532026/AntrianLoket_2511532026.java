package pekan4_2511532026;
import java.util.Scanner;

class Queue_2511532026 {
    String[] queue_2026;
    int front_2026, rear_2026, size_2026, max_2026;

    public Queue_2511532026(int max_2026) {
        this.max_2026 = max_2026;
        this.front_2026 = 0;
        this.size_2026 = 0;
        this.rear_2026 = max_2026 - 1;
        this.queue_2026 = new String[max_2026];
    }

    public boolean isEmpty_2026() {
        return (size_2026 == 0);
    }

    public boolean isFull_2026() {
        return (size_2026 == max_2026);
    }

    public void enqueue_2026(String data_2026) {
        if (isFull_2026()) {
            System.out.println("Antrian penuh!");
            return;
        }

        rear_2026 = (rear_2026 + 1) % max_2026;
        queue_2026[rear_2026] = data_2026;
        size_2026++;

        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    public void dequeue_2026() {
        if (isEmpty_2026()) {
            System.out.println("Antrian kosong!");
            return;
        }

        String data_2026 = queue_2026[front_2026];
        front_2026 = (front_2026 + 1) % max_2026;
        size_2026--;

        System.out.println(data_2026 + " telah dilayani");
    }

    public void display_2026() {
        if (isEmpty_2026()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Isi antrian:");
        for (int i_2026 = 0; i_2026 < size_2026; i_2026++) {
            System.out.println((i_2026 + 1) + ". " + queue_2026[(front_2026 + i_2026) % max_2026]);
        }
    }

    public void Reverse_2026() {
        if (isEmpty_2026()) {
            System.out.println("Antrian kosong!");
            return;
        }

        String[] temp_2026 = new String[size_2026];

        for (int i_2026 = 0; i_2026 < size_2026; i_2026++) {
            temp_2026[i_2026] = queue_2026[(front_2026 + i_2026) % max_2026];
        }

        for (int i_2026 = 0; i_2026 < size_2026; i_2026++) {
            queue_2026[(front_2026 + i_2026) % max_2026] = temp_2026[size_2026 - 1 - i_2026];
        }

        display_2026();
    }
}

public class AntrianLoket_2511532026 {
    public static void main(String[] args) {
        Scanner input_2026 = new Scanner(System.in);
        Queue_2511532026 antrian_2026 = new Queue_2511532026(10);
        int pilihan_2026;
        String nama_2026;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2026 = input_2026.nextInt();
            input_2026.nextLine();

            switch (pilihan_2026) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    nama_2026 = input_2026.nextLine();
                    antrian_2026.enqueue_2026(nama_2026);
                    break;

                case 2:
                    antrian_2026.dequeue_2026();
                    break;

                case 3:
                    antrian_2026.display_2026();
                    break;

                case 4:
                    antrian_2026.Reverse_2026();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2026 != 5);

        input_2026.close();
    }
}