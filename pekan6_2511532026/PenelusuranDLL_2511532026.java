package pekan6_2511532026;
public class PenelusuranDLL_2511532026 {

    // fungsi penelusuran maju
    static void forwardTraversal_2026(NodeDLL_2511532026 head_2026) {

        // memulai penelusuran dari head
        NodeDLL_2511532026 curr_2026 = head_2026;

        // lanjutkan sampai akhir
        while (curr_2026 != null) {

            // print data
            System.out.print(curr_2026.data_2026 + " <-> ");

            // pindah ke node berikutnya
            curr_2026 = curr_2026.next_2026;
        }

        // print spasi
        System.out.println();
    }

    // fungsi penelusuran mundur
    static void backwardTraversal_2026(NodeDLL_2511532026 tail_2026) {

        // mulai dari akhir
        NodeDLL_2511532026 curr_2026 = tail_2026;

        // lanjut sampai head
        while (curr_2026 != null) {

            // cetak data
            System.out.print(curr_2026.data_2026 + " <-> ");

            // pindah ke node sebelumnya
            curr_2026 = curr_2026.prev_2026;
        }

        // cetak spasi
        System.out.println();
    }
    public void main(String[] args) {
    	NodeDLL_2511532026 head_2026 = new NodeDLL_2511532026(1);
    	NodeDLL_2511532026 second_2026 = new NodeDLL_2511532026(2);
    	NodeDLL_2511532026 third_2026 = new NodeDLL_2511532026(3);
    	
    	head_2026.next_2026 = second_2026;
    	second_2026.prev_2026 = head_2026;
    	second_2026.next_2026 = third_2026;
    	third_2026.prev_2026 = second_2026;
    	
    	System.out.println ("Penelusuran maju:");
    	forwardTraversal_2026 (head_2026);
    	System.out.println ("Penelusuran mundur:");
    	backwardTraversal_2026 (third_2026);
    	
    }
    
}