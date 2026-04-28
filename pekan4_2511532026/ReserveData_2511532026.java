package pekan4_2511532026;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReserveData_2511532026 {
	public static void main(String[] args) {
		Queue<Integer> q_2026 = new LinkedList<Integer>();
		q_2026.add(1);
		q_2026.add(2);
		q_2026.add(3);
		System.out.println("sebelum reverse" + q_2026);
		Stack<Integer> s_2026 = new Stack<Integer>();
		while (!q_2026.isEmpty()) {
			s_2026.push(q_2026.remove());
		}
		while (!s_2026.isEmpty()) {
			q_2026.add(s_2026.pop());
		}
		System.out.println("sesudah reverse : " +q_2026);
		
	}

}
