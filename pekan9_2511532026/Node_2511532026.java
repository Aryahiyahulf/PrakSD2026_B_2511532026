package pekan9_2511532026;

public class Node_2511532026 {
	int data_2026;
	Node_2511532026 left_2026;
	Node_2511532026 right_2026;
	public Node_2511532026(int data_2026) {
		this.data_2026 = data_2026;
		left_2026 = null;
		right_2026 = null;
		
	}
	public void setLeft_2026(Node_2511532026 node_2026) {
		if (left_2026 == null)
			left_2026 = node_2026;
	}
	public void setRight_2026(Node_2511532026 node_2026) {
		if (right_2026 == null)
			right_2026 = node_2026;
	}
	public Node_2511532026 getLeft_2026() {
		return left_2026;
	}
	public Node_2511532026 getRight_2026() {
		return right_2026;
	}
	public int getData_2026() {
		return data_2026;
		
	}
	public void setData_2026 (int data_2026) {
		this.data_2026 = data_2026;
	}
	void printPreorder_2026(Node_2511532026 node_2026) {
		if (node_2026==null)
			return;
		System.out.print(node_2026.data_2026 + " ");
		printPreorder_2026(node_2026.left_2026);
		printPreorder_2026(node_2026.right_2026);
	}
	void printPostorder_2026(Node_2511532026 node_2026) {
		if (node_2026 == null)
			return;
		printPostorder_2026(node_2026.left_2026);
		System.out.print(node_2026.data_2026 + " ");
		printPostorder_2026(node_2026.right_2026);
	}
	void printInorder_2026(Node_2511532026 node_2026) {
		if (node_2026 == null)
			return;
		printInorder_2026(node_2026.left_2026);
		System.out.print(node_2026.data_2026 + " ");
		printInorder_2026(node_2026.right_2026);
		
	}
	public String print() {
		return this.print("",true,"");
		
	}
	public String print(String prefix,boolean isTail,String sb) {
		if(right_2026 != null) {
			right_2026.print(prefix+ (isTail ? "|  " : "  "),false,sb);
		}
			System.out.println(prefix + (isTail ? "\\-- " : "/-- ")+data_2026);
			if(left_2026!=null) {
				left_2026.print(prefix+(isTail ? "  " : "| "),true,sb);
			}
				return sb;
			}
			
		}
	

