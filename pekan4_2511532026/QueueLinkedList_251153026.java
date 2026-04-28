package pekan4_2511532026;

import java.util.*;

public class QueueLinkedList_251153026 {

	public static void main(String[] args) {
		Queue<Integer> q_2026 = new LinkedList<>();
		for ( int i=0; i<6; i++)
			q_2026.add(i);
		
		System.out.println("elemen antrian " +q_2026);
		
		int hapus = q_2026.remove();
		System.out.println("hapus elemen =" +hapus);
		System.out.println(q_2026);
		
		int depan = q_2026.peek();
		System.out.println("kepala antrian = " + depan);
		
		int banyak = q_2026.size();
		System.out.println("size antrian = " + banyak);
		
	}

}
