package pekan4_2511532026;
import java.util.*;
public class IterasiQueue_2511532026 {

	 public static void main(String args[]) {

	        Queue<String> q_2026 = new LinkedList<>();

	        q_2026.add("Praktikum");
	        q_2026.add("Struktur");
	        q_2026.add("Data");
	        q_2026.add("Dan");
	        q_2026.add("Algoritma");

	        Iterator<String> iterator = q_2026.iterator();

	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	    }
	}