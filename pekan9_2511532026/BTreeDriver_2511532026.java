package pekan9_2511532026;

public class BTreeDriver_2511532026 {

    public static void main(String[] args) {

        BTree_2511532026 tree_2026 = new BTree_2511532026();

        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_2026.countNodes_2026());

        Node_2511532026 root_2026 = new Node_2511532026(1);
        tree_2026.setRoot_2026(root_2026);

        System.out.print("Jumlah simpul jika hanya ada root: ");
        System.out.println(tree_2026.countNodes_2026());

        Node_2511532026 node2_2026 = new Node_2511532026(2);
        Node_2511532026 node3_2026 = new Node_2511532026(3);
        Node_2511532026 node4_2026 = new Node_2511532026(4);
        Node_2511532026 node5_2026 = new Node_2511532026(5);
        Node_2511532026 node6_2026 = new Node_2511532026(6);
        Node_2511532026 node7_2026 = new Node_2511532026(7);
        Node_2511532026 node8_2026 = new Node_2511532026(8);
        Node_2511532026 node9_2026 = new Node_2511532026(9);

        root_2026.setLeft_2026(node2_2026);
        node2_2026.setLeft_2026(node4_2026);
        node2_2026.setRight_2026(node5_2026);
        node4_2026.setRight_2026(node8_2026);
        root_2026.setRight_2026(node3_2026);
        node3_2026.setLeft_2026(node6_2026);
        node3_2026.setRight_2026(node7_2026);
        node6_2026.setLeft_2026(node9_2026);
        tree_2026.setCurrent_2026(tree_2026.getRoot_2026());
        //set root
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_2026.getCurrent_2026().getData_2026());

        System.out.println("Jumlah simpul setelah simpul 7 ditambahkan");
        System.out.println(tree_2026.countNodes_2026());

        System.out.println("InOrder: ");
        tree_2026.printInorder_2026();

        System.out.println("\nPreorder: ");
        tree_2026.printPreOrder_2026();

        System.out.println("\nPostorder: ");
        tree_2026.printPostOrder_2026();

        System.out.println("\nmenampilkan simpul dalam bentuk pohon");
        tree_2026.print_2026();
    }
    
}
