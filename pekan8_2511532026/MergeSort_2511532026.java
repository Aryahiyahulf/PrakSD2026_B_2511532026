package pekan8_2511532026;
public class MergeSort_2511532026 {

    void merge_2026(int arr_2026[], int l_2026, int m_2026, int r_2026) {

        // Find sizes of two subarrays to be merged
        int n1_2026 = m_2026 - l_2026 + 1;
        int n2_2026 = r_2026 - m_2026;

        // Create temp arrays
        int L_2026[] = new int[n1_2026];
        int R_2026[] = new int[n2_2026];

        // Copy data to temp arrays
        for (int i_2026 = 0; i_2026 < n1_2026; ++i_2026)
            L_2026[i_2026] = arr_2026[l_2026 + i_2026];

        for (int j_2026 = 0; j_2026 < n2_2026; ++j_2026)
            R_2026[j_2026] = arr_2026[m_2026 + 1 + j_2026];

        // Initial indexes of merged subarray array
        int i_2026 = 0;
        int j_2026 = 0;

        int k_2026 = l_2026;

        while (i_2026 < n1_2026 && j_2026 < n2_2026) {

            if (L_2026[i_2026] <= R_2026[j_2026]) {
                arr_2026[k_2026] = L_2026[i_2026];
                i_2026++;
            } else {
                arr_2026[k_2026] = R_2026[j_2026];
                j_2026++;
            }

            k_2026++;
        }

        // Copy remaining elements of L[] if any
        while (i_2026 < n1_2026) {
            arr_2026[k_2026] = L_2026[i_2026];
            i_2026++;
            k_2026++;
        }

        // Copy remaining elements of R[] if any
        while (j_2026 < n2_2026) {
            arr_2026[k_2026] = R_2026[j_2026];
            j_2026++;
            k_2026++;
        }
    }
    void sort_2026(int arr_2026[], int l_2026, int r_2026) {

        if (l_2026 < r_2026) {

            // Find the middle point
            int m_2026 = (l_2026 + r_2026) / 2;

            // Sort first and second halves
            sort_2026(arr_2026, l_2026, m_2026);
            sort_2026(arr_2026, m_2026 + 1, r_2026);

            // Merge the sorted halves
            merge_2026(arr_2026, l_2026, m_2026, r_2026);
        }
    }

    // A utility function to print array of size n
    static void printArray_2026(int arr_2026[]) {

        int n_2026 = arr_2026.length;

        for (int i_2026 = 0; i_2026 < n_2026; ++i_2026)
            System.out.print(arr_2026[i_2026] + " ");

        System.out.println();
    }

    public static void main(String args_2026[]) {

        int arr_2026[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_2026(arr_2026);

        MergeSort_2511532026 ob_2026 = new MergeSort_2511532026();

        ob_2026.sort_2026(arr_2026, 0, arr_2026.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort");

        printArray_2026(arr_2026);
    }
}