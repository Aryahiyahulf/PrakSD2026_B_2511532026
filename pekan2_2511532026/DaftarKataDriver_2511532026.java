package pekan2_2511532026;

public class DaftarKataDriver_2511532026 {

	public static void main(String[] args) {
		DaftarKata_2511532026 al = new DaftarKata_2511532026();
		
		
		// Menambah elemen (akhir)
		al.tambah_2511532026("kami");
		al.tambah_2511532026("Informatika");
		
		// Menyisipkan elemen pada indeks 1
		al.tambahPada_2511532026(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal		: " + al);
		
		// Mengubah elemen (index 1)
		al.ubahElemen_2511532026(1, "Departemen");
		System.out.println("Setelah Ubah 	: " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511532026(0);
		System.out.println("Terhapus		: " + terhapus);
		System.out.println("Setelah Hapus	: " +  al);
		
		// Iterasi pada ArrayList (cetak setiap elemn)
		System.out.print("Iterasi		: ");
		al.iterasiCetak_2511532026();
		System.out.println();

	}


		

	}

