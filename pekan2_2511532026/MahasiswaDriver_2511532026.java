package pekan2_2511532026;
import java.util.*;
public class MahasiswaDriver_2511532026 {
	 public static void tampilkanMenu() {
		 System.out.println ("\nMenu:");
		 System.out.println ("1. Tambah Mahasiswa");
		 System.out.println ("2. Tampilkan Semua Mahasiswa");
		 System.out.println ("3. Hapus Mhasiswa Berdasarkan NIM");
		 System.out.println ("4. cari mahasiswa berdasarkan NIM");
		 System.out.println ("5. Keluar");
	 }
	 
	 
	 public static void tambahMahasiswa_2511532026(ArrayList <Mahasiswa_2511532026> list, Scanner sc)  {
		 System.out.println ("Masukan NIM: ");
		 String nim = sc.nextLine();
		 System.out.println ("Masukan Nama: ");
		 String nama = sc.nextLine();
		 System.out.println ("Masukan prodi: ");
		 String prodi = sc.nextLine();
		 list.add(new Mahasiswa_2511532026 (nim,nama,prodi));
		 System.out.println("Mahasiswa Berhasil Ditambahkan.");
	 }


public static void tampilkanSemuaMahasiswa_2511532026(ArrayList<Mahasiswa_2511532026> list) {
    if (list.isEmpty()) {
        System.out.println("Daftar mahasiswa kosong.");
    } else {
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa_2511532026 mhs : list) {
            System.out.println(mhs);
        }
    }
}

public static void hapusMahasiswa_2511532026(ArrayList<Mahasiswa_2511532026> list, Scanner sc) {
    System.out.print("Masukkan NIM yang akan dihapus: ");
    String nimHapus = sc.nextLine();

    boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));

    if (removed) {
        System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
    } else {
        System.out.println("NIM tidak ditemukan.");
    }
}

public static void cariMahasiswa_2511532026(ArrayList<Mahasiswa_2511532026> list, Scanner sc) {
    System.out.print("Masukkan NIM yang dicari: ");
    String nimCari = sc.nextLine();
    boolean ditemukan = false;
    
     for(Mahasiswa_2511532026 mhs:list ) {
    	 if (mhs.nim.equals(nimCari)) {
    		 System.out.println ("hasil pencarian : " + mhs);
    		 ditemukan = true;
    		 break;
    	 }
     }
     
     if (!ditemukan) {
    	 System.out.println ("NIM tidak ada.");
    	 
     }
     
}
	public static void main(String[] args) {
		ArrayList <Mahasiswa_2511532026> mahasiswaList = new ArrayList <>();
		Scanner scanner = new Scanner(System.in);
		int choice;
	

	
do {
    tampilkanMenu();
    System.out.print("Pilih menu: ");
    choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (choice) {
        case 1:
            tambahMahasiswa_2511532026(mahasiswaList, scanner);
            break;

        case 2:
            tampilkanSemuaMahasiswa_2511532026(mahasiswaList);
            break;

        case 3:
            hapusMahasiswa_2511532026(mahasiswaList, scanner);
            break;

        case 4:
            cariMahasiswa_2511532026(mahasiswaList, scanner);
            break;

        case 5:
            System.out.println("Keluar dari program.");
            break;

        default:
            System.out.println("Pilihan tidak valid.");
    }

} while (choice != 5);

scanner.close();
		}
	}