package pekan9_2511532026;

public class BTree_2511532026 {
    private Node_2511532026 root_2026;
    private Node_2511532026 currentNode_2026;

    public BTree_2511532026() {
        root_2026 = null;
    }

    public boolean search_2026(int data_2026) {
        return search_2026(root_2026, data_2026);
    }

    private boolean search_2026(Node_2511532026 node_2026, int data_2026) {
        if (node_2026.getData_2026() == data_2026)
            return true;

        if (node_2026.getLeft_2026() != null)
            if (search_2026(node_2026.getLeft_2026(), data_2026))
                return true;

        if (node_2026.getRight_2026() != null)
            if (search_2026(node_2026.getRight_2026(), data_2026))
                return true;

        return false;
    }

    public void printInorder_2026() {
        root_2026.printInorder_2026(root_2026);
    }

    public void printPreOrder_2026() {
        root_2026.printPreorder_2026(root_2026);
    }

    public void printPostOrder_2026() {
        root_2026.printPostorder_2026(root_2026);
    }

    public Node_2511532026 getRoot_2026() {
        return root_2026;
    }
    public boolean isEmpty_2026() {
        return root_2026 == null;
    }

    public int countNodes_2026() {
        return countNodes_2026(root_2026);
    }

    private int countNodes_2026(Node_2511532026 node_2026) {
        int count_2026 = 1;

        if (node_2026 == null) {
            return 0;
        } else {
            count_2026 += countNodes_2026(node_2026.getLeft_2026());
            count_2026 += countNodes_2026(node_2026.getRight_2026());
            return count_2026;
        }
    }

    public void print_2026() {
        root_2026.print();
    }

    public Node_2511532026 getCurrent_2026() {
        return currentNode_2026;
    }

    public void setCurrent_2026(Node_2511532026 node_2026) {
        this.currentNode_2026 = node_2026;
    }

    public void setRoot_2026(Node_2511532026 root_2026) {
        this.root_2026 = root_2026;
    }
}
