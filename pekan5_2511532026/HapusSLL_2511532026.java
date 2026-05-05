package pekan5_2511532026;

public class HapusSLL_2511532026 {
	public static NodeSLL_2511532026 deleteHead_2026(NodeSLL_2511532026 head_2026) {
		if (head_2026 ==null)
			return null;
		head_2026 =head_2026.next_2026;
		return head_2026;
			
	}
	public static NodeSLL_2511532026 removeLastNode_2026(NodeSLL_2511532026 head_2026) {
		if(head_2026==null) {
			return null;
			
		}
		if (head_2026.next_2026 ==null) {
			return null;
			
		}
		NodeSLL_2511532026 secondlast_2026 = head_2026;
		while (secondlast_2026.next_2026.next_2026 !=null) {
			secondlast_2026 = secondlast_2026.next_2026;
		}
		secondlast_2026.next_2026 = null;
		return head_2026;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532026 deleteNode_2026(NodeSLL_2511532026 head, int position) {
	    NodeSLL_2511532026 temp_2026 = head;
	    NodeSLL_2511532026 prev_2026 = null;

	    // jika linked list null
	    if (temp_2026 == null)
	        return head;

	    // kasus 1: head dihapus
	    if (position == 1) {
	        head = temp_2026.next_2026;
	        return head;
	    }

	    // kasus 2: menghapus node di tengah
	    // telusuri ke node yang dihapus
	    for (int i = 1; temp_2026 != null && i < position; i++) {
	        prev_2026 = temp_2026;
	        temp_2026 = temp_2026.next_2026;
	    }
	    // jika ditemukan, hapus node
	    if (temp_2026 != null)
	        prev_2026.next_2026 = temp_2026.next_2026;
	    else
	        System.out.println("Data tidak ada");

	    return head;
	}

	// fungsi mencetak SLL
	public static void printList_2026(NodeSLL_2511532026 head) {
	    NodeSLL_2511532026 curr_2026 = head;

	    while (curr_2026.next_2026 != null) {
	        System.out.print(curr_2026.data_2026 + "-->");
	        curr_2026 = curr_2026.next_2026;
	    }

	    if (curr_2026.next_2026 == null) {
	        System.out.print(curr_2026.data_2026);
	    }

	    System.out.println();

	
	}
	// kelas main
	public static void main(String[] args) {
	    // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
	    NodeSLL_2511532026 head_2026 = new NodeSLL_2511532026(1);
	    head_2026.next_2026 = new NodeSLL_2511532026(2);
	    head_2026.next_2026.next_2026 = new NodeSLL_2511532026(3);
	    head_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(4);
	    head_2026.next_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(5);
	    head_2026.next_2026.next_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(6);

	    // cetak list awal
	    System.out.println("List awal: ");
	    printList_2026(head_2026);

	    // hapus head
	    head_2026 = deleteHead_2026(head_2026);
	    System.out.println("List setelah head dihapus: ");
	    printList_2026(head_2026);

	    // hapus node terakhir
	    head_2026 = removeLastNode_2026(head_2026);
	    System.out.println("List setelah simpul terakhir di hapus: ");
	    printList_2026(head_2026);

	    // Deleting node at position 2
	    int position = 2;
	    head_2026 = deleteNode_2026(head_2026, position);

	    // Print list after deletion
	    System.out.println("List setelah posisi 2 dihapus: ");
	    printList_2026(head_2026);
	}
		
	}


