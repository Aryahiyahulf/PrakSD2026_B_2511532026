package pekan6_2511532026;

public class InsertDLL_2511532026 {
	
	static NodeDLL_2511532026 insertBegin_2026 (NodeDLL_2511532026 head, int data) {
		//baut node baru
		NodeDLL_2511532026 newnode_2026 = new NodeDLL_2511532026(data);
		//jadikan pointer prev nya head
		newnode_2026.next_2026 =head;
		//jadfikan pointer prev head ke new node
		if (head!=null) {
			head.prev_2026 = newnode_2026;
		}
		return newnode_2026;
	}
	
public static NodeDLL_2511532026 insertEnd_2026(NodeDLL_2511532026 head,int newData) {
	//buat node baru
	NodeDLL_2511532026 newNode_2026 = new NodeDLL_2511532026 (newData);
	//jika dll nul jadikan head
	if (head == null) {
		head = newNode_2026;
	}
	else {
		NodeDLL_2511532026 curr_2026 = head;
		while (curr_2026.next_2026 != null) {
			curr_2026 =curr_2026.next_2026;
		}
		curr_2026.next_2026 = newNode_2026;
		newNode_2026.prev_2026 = curr_2026;
	}
		return head;
	}
public static NodeDLL_2511532026 insertAtPosition_2026(NodeDLL_2511532026 head_2026, int pos_2026, int new_data_2026) {

    // Buat node baru
    NodeDLL_2511532026 new_node_2026 = new NodeDLL_2511532026(new_data_2026);

    if (pos_2026 == 1) {

        new_node_2026.next_2026 = head_2026;

        if (head_2026 != null) {
            head_2026.prev_2026 = new_node_2026;
        }

        head_2026 = new_node_2026;
        return head_2026;
    }

    NodeDLL_2511532026 curr_2026 = head_2026;

    for (int i_2026 = 1; i_2026 < pos_2026 - 1 && curr_2026 != null; ++i_2026) {
        curr_2026 = curr_2026.next_2026;
    }

    if (curr_2026 == null) {
        System.out.println("Posisi tidak ada");
        return head_2026;
    }

    new_node_2026.prev_2026 = curr_2026;
    new_node_2026.next_2026 = curr_2026.next_2026;
    curr_2026.next_2026 = new_node_2026;

    if (new_node_2026.next_2026 != null) {
        new_node_2026.next_2026.prev_2026 = new_node_2026;
    }

    return head_2026;
}

public static void printList_2026(NodeDLL_2511532026 head_2026) {

    NodeDLL_2511532026 curr_2026 = head_2026;

    while (curr_2026 != null) {
        System.out.print(curr_2026.data_2026 + " <-> ");
        curr_2026 = curr_2026.next_2026;
    }

    System.out.println();
	}
public static void main(String[] args) {

    // membuat dll 2 <-> 3 <-> 5
    NodeDLL_2511532026 head_2026 = new NodeDLL_2511532026(2);

    head_2026.next_2026 = new NodeDLL_2511532026(3);
    head_2026.next_2026.prev_2026 = head_2026;

    head_2026.next_2026.next_2026 = new NodeDLL_2511532026(5);
    head_2026.next_2026.next_2026.prev_2026 = head_2026.next_2026;

    // cetak DLL awal
    System.out.print("DLL Awal: ");
    printList_2026(head_2026);

    // tambah 1 di awal
    head_2026 = insertBegin_2026(head_2026, 1);

    System.out.print(
            "simpul 1 ditambah di awal: ");

    printList_2026(head_2026);

    // tambah 6 di akhir
    System.out.print(
            "simpul 6 ditambah di akhir: ");

    int data_2026 = 6;

    head_2026 = insertEnd_2026(head_2026, data_2026);

    printList_2026(head_2026);

    // menambah node 4 di posisi 4
    System.out.print("tambah node 4 di posisi 4: ");

    int data2_2026 = 4;
    int pos_2026 = 4;

    head_2026 = insertAtPosition_2026(head_2026, pos_2026, data2_2026);

    printList_2026(head_2026);
	
	}
}