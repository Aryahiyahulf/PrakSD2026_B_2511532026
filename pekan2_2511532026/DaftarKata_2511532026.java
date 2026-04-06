package pekan2_2511532026;
import java.util.*;
public class DaftarKata_2511532026 {
	private final ArrayList<String> data;
	
	public DaftarKata_2511532026() {
		this.data = new ArrayList<> ();
		
	}
	
	public void tambah(String elemen) {
		data.add(elemen);
		
	}
	public void tambahPada (int index, String elemen) {
		data.add(index,elemen);
		
	}
	public void ubahElemen (int index, String nilaiBaru) {
		data.set(index,nilaiBaru);
		
}
	public String hapusElemen (int index) {
		return data.remove(index);
		
	}}

