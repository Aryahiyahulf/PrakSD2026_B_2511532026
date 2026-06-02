package pekan8_2511532026;
public class QuickSort_2511532026 {

    static void swap_2026(int[] arr_2026, int i_2026, int j_2026) {
        int temp_2026 = arr_2026[i_2026];
        arr_2026[i_2026] = arr_2026[j_2026];
        arr_2026[j_2026] = temp_2026;
    }

    // Memilih pivot menggunakan Median-of-Three
    static void medianOfThree_2026(int[] arr_2026, int low_2026, int high_2026) {

        int mid_2026 = low_2026 + (high_2026 - low_2026) / 2;

        // Urutkan elemen low, mid dan high
        if (arr_2026[low_2026] > arr_2026[mid_2026]) {
            swap_2026(arr_2026, low_2026, mid_2026);
        }
        if (arr_2026[low_2026] > arr_2026[high_2026]) {
            swap_2026(arr_2026, low_2026, high_2026);
        }
        if (arr_2026[mid_2026] > arr_2026[high_2026]) {
            swap_2026(arr_2026, mid_2026, high_2026);
        }
        swap_2026(arr_2026, mid_2026, high_2026);
    }

    static int partition_2026(int[] arr_2026, int low_2026, int high_2026) {

        // Panggil metode medianOfThree sebelum menentukan pivot
        medianOfThree_2026(arr_2026, low_2026, high_2026);

        int pivot_2026 = arr_2026[high_2026];
        int i_2026 = (low_2026 - 1);

        for (int j_2026 = low_2026; j_2026 <= high_2026 - 1; j_2026++) {

            // Jika elemen lebih kecil dari atau sama dengan pivot
            if (arr_2026[j_2026] <= pivot_2026) {

                // Increment indeks elemen yang lebih kecil
                i_2026++;
                swap_2026(arr_2026, i_2026, j_2026);
            }
        }

        swap_2026(arr_2026, i_2026 + 1, high_2026);
        return (i_2026 + 1);
    }
    static void quickSort_2026(int[] arr_2026, int low_2026, int high_2026) {

        if (low_2026 < high_2026) {

            int pi_2026 = partition_2026(arr_2026, low_2026, high_2026);

            quickSort_2026(arr_2026, low_2026, pi_2026 - 1);
            quickSort_2026(arr_2026, pi_2026 + 1, high_2026);
        }
    }

    public static void printArr_2026(int[] arr_2026) {

        for (int i_2026 = 0; i_2026 < arr_2026.length; i_2026++) {
            System.out.print(arr_2026[i_2026] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args_2026) {

        int[] arr_2026 = {10, 7, 8, 9, 1, 5};
        int N_2026 = arr_2026.length;

        System.out.print("Data sebelum diurutkan: ");
        printArr_2026(arr_2026);

        quickSort_2026(arr_2026, 0, N_2026 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr_2026(arr_2026);
    }
}