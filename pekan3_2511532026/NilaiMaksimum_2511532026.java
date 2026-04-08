package pekan3_2511532026;
import java.util.*;
public class NilaiMaksimum_2511532026 {

    public static int max(Stack<Integer> s) {
        Stack<Integer> backup = new Stack<Integer>();

        int maxValue = s.pop();
        backup.push(maxValue);

        while (!s.isEmpty()) {
            int next = s.pop();
            backup.push(next);
            maxValue = Math.max(maxValue, next);
        }

        // Mengembalikan isi stack seperti semula
        while (!backup.isEmpty()) {
            s.push(backup.pop());
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Stack<Integer> ary = new Stack<Integer>();

        ary.push(70);
        ary.push(12);
        ary.push(20);
        ary.push(26*19);
        ary.push(19);
        ary.push(26);
        

        System.out.println("Isi stack " + ary);
        System.out.println("Stack Teratas " + ary.peek());
        System.out.println("Nilai maksimum " + max(ary));
    }
}


