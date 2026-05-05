package pekan5_2511532026;

public class TambahSLL_2511532026 {
	 public static NodeSLL_2511532026 insertAtFront_2026(NodeSLL_2511532026 head, int value) {
	        NodeSLL_2511532026 new_node = new NodeSLL_2511532026(value);
	        new_node.next_2026 = head;
	        return new_node;
	    }

	    // fungsi menambahkan node di akhir SLL
	    public static NodeSLL_2511532026 insertAtEnd_2026(NodeSLL_2511532026 head, int value) {
	        // buat sebuah node dengan sebuah nilai
	        NodeSLL_2511532026 newNode = new NodeSLL_2511532026(value);

	        // jika list kosong maka node jadi head
	        if (head == null) {
	            return newNode;
	        }

	        // simpan head ke variabel sementara
	        NodeSLL_2511532026 last = head;

	        // telusuri ke node akhir
	        while (last.next_2026 != null) {
	            last = last.next_2026;
	        }

	        // ubah pointer
	        last.next_2026 = newNode;
	        return head;
	    }

	    static NodeSLL_2511532026 GetNode_2026(int data) {
	        return new NodeSLL_2511532026(data);
	    }
	    static NodeSLL_2511532026 insertPos_2026(NodeSLL_2511532026 headNode, int position, int value) {
	        NodeSLL_2511532026 head = headNode;

	        if (position < 1)
	            System.out.print("Invalid position");

	        if (position == 1) {
	            NodeSLL_2511532026 new_node = new NodeSLL_2511532026(value);
	            new_node.next_2026 = head;
	            return new_node;
	        } else {
	            while (position-- != 0) {
	                if (position == 1) {
	                    NodeSLL_2511532026 newNode = GetNode_2026(value);
	                    newNode.next_2026 = headNode.next_2026;
	                    headNode.next_2026 = newNode;
	                    break;
	                }
	                headNode = headNode.next_2026;
	            }

	            if (position != 1)
	                System.out.print("Posisi di luar jangkauan");
	        }

	        return head;
	    }

	    public static void printList_2026(NodeSLL_2511532026 head) {
	        NodeSLL_2511532026 curr = head;

	        while (curr.next_2026 != null) {
	            System.out.print(curr.data_2026 + "-->");
	            curr = curr.next_2026;
	        }

	        if (curr.next_2026 == null) {
	            System.out.print(curr.data_2026);
	        }

	        System.out.println();
	    }
	    public static void main(String[] args) {
	        // buat linked list 2->3->5->6
	        NodeSLL_2511532026 head_2026 = new NodeSLL_2511532026(2);
	        head_2026.next_2026 = new NodeSLL_2511532026(3);
	        head_2026.next_2026.next_2026 = new NodeSLL_2511532026(5);
	        head_2026.next_2026.next_2026.next_2026 = new NodeSLL_2511532026(6);

	        // cetak list asal
	        System.out.print("Senarai berantai awal:");
	        printList_2026(head_2026);

	        // tambahkan node baru di depan
	        System.out.print("Tambah 1 simpul di depan: ");
	        int data_2026 = 1;
	        head_2026 = insertAtFront_2026(head_2026, data_2026);

	        // cetak update list
	        printList_2026(head_2026);
	        //tambahkan node baru dibelakang
	        System.out.print("Tambah 1 simpul di belakang: ");
	        int data2_2026 = 7;
	        head_2026 = insertAtEnd_2026(head_2026, data2_2026);

	        // cetak update list
	        printList_2026(head_2026);

	        // tambah node di posisi tertentu
	        System.out.print("Tambah 1 simpul ke data 4: ");
	        int data3_2026 = 4;
	        int pos_2026 = 4;
	        head_2026 = insertPos_2026(head_2026, pos_2026, data3_2026);

	        // cetak update list
	        printList_2026(head_2026);
	    }
	}