package pekan5_2511532026;

public class PencarianSLL_2511532026 {
	static boolean searchKey_2026 (NodeSLL_2511532026 head_2026, int key_2026) {
		NodeSLL_2511532026 curr_2026 = head_2026;
		while (curr_2026 != null) {
			if (curr_2026.data_2026 == key_2026)
				return true;
			curr_2026 = curr_2026.next_2026;
		}
		return false;
	}
	public static void traversal_2026 (NodeSLL_2511532026 head) {
		NodeSLL_2511532026 curr_2026 = head;
		
		while (curr_2026 != null) {
			System.out.println(" " + curr_2026.data_2026);
			curr_2026 = curr_2026.next_2026;
		}
		System.out.println();
	}
	 public static void main(String[] args) {
	        NodeSLL_2511532026 head_2026 = new NodeSLL_2511532026(14);
	        head_2026.next_2026 = new NodeSLL_2511532026(21);
	        head_2026.next_2026.next_2026 = new NodeSLL_2511532026(13);
	        head_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(30);
	        head_2026.next_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(10);

	        System.out.print("Penelusuran SLL : ");
	        traversal_2026(head_2026);

	        // data yang akan dicari
	        int key = 30;
	        System.out.print("cari data " + key + " : ");

	        if (searchKey_2026(head_2026, key))
	            System.out.println("ketemu");
	        else
	            System.out.println("tidak ada");
		
	}

}
