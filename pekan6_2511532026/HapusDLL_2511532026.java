package pekan6_2511532026;
public class HapusDLL_2511532026 {

    // fungsi menghapus node awal
    public static NodeDLL_2511532026 delHead_2026(NodeDLL_2511532026 head_2026) {

        if (head_2026 == null) {
            return null;
        }

        NodeDLL_2511532026 temp_2026 = head_2026;

        head_2026 = head_2026.next_2026;

        if (head_2026 != null) {
            head_2026.prev_2026 = null;
        }

        return head_2026;
    }

    // fungsi menghapus di akhir
    public static NodeDLL_2511532026 delLast_2026(NodeDLL_2511532026 head_2026) {

        if (head_2026 == null) {
            return null;
        }

        if (head_2026.next_2026 == null) {
            return null;
        }

        NodeDLL_2511532026 curr_2026 = head_2026;

        while (curr_2026.next_2026 != null) {
            curr_2026 = curr_2026.next_2026;
        }

        // update pointer previous node
        if (curr_2026.prev_2026 != null) {
            curr_2026.prev_2026.next_2026 = null;
        }

        return head_2026;
    }
 // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511532026 delPos_2026(NodeDLL_2511532026 head_2026, int pos_2026) {

        // jika DLL kosong
        if (head_2026 == null) {
            return head_2026;
        }

        NodeDLL_2511532026 curr_2026 = head_2026;

        // telusuri sampai ke node yang akan dihapus
        for (int i_2026 = 1; curr_2026 != null && i_2026 < pos_2026; ++i_2026) {
            curr_2026 = curr_2026.next_2026;
        }

        // jika posisi tidak ditemukan
        if (curr_2026 == null) {
            return head_2026;
        }

        // update pointer
        if (curr_2026.prev_2026 != null) {
            curr_2026.prev_2026.next_2026 = curr_2026.next_2026;
        }

        if (curr_2026.next_2026 != null) {
            curr_2026.next_2026.prev_2026 = curr_2026.prev_2026;
        }

        // jika yang dihapus head
        if (head_2026 == curr_2026) {
            head_2026 = curr_2026.next_2026;
        }

        return head_2026;
    }

    // fungsi mencetak DLL
    public static void printList_2026(NodeDLL_2511532026 head_2026) {

        NodeDLL_2511532026 curr_2026 = head_2026;

        while (curr_2026 != null) {
            System.out.print(curr_2026.data_2026 + " ");
            curr_2026 = curr_2026.next_2026;
        }

        System.out.println();
    }
    public static void main(String[] args) {
    	//buat sebuah dll
    	NodeDLL_2511532026 head_2026 = new NodeDLL_2511532026(1);
    	head_2026.next_2026 = new NodeDLL_2511532026(2);
    	head_2026.next_2026.prev_2026= head_2026;
    	head_2026.next_2026.next_2026 = new NodeDLL_2511532026(3);
    	head_2026.next_2026.next_2026.prev_2026 = head_2026.next_2026;
    	head_2026.next_2026.next_2026.next_2026 = new NodeDLL_2511532026(4);
    	head_2026.next_2026.next_2026.next_2026.prev_2026 = head_2026.next_2026.next_2026;
    	head_2026.next_2026.next_2026.next_2026.next_2026 = new NodeDLL_2511532026 (5);
    	head_2026.next_2026.next_2026.next_2026.next_2026.prev_2026 = head_2026.next_2026.next_2026.next_2026;
    	System.out.print("DLL Awal : ");
		printList_2026(head_2026);
		
		System.out.print("Setelah head di hapus : ");
		head_2026 = delHead_2026(head_2026);
		printList_2026(head_2026);
		
		System.out.print("Setelah node terakhir di hapus : ");
		head_2026 = delLast_2026(head_2026);
		printList_2026(head_2026);
		
		System.out.print("menghapus node ke-2 : ");
		head_2026 = delPos_2026(head_2026, 2);
		
		printList_2026(head_2026);
	}	
    	
    }
