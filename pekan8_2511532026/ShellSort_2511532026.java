package pekan8_2511532026;
public class ShellSort_2511532026 {

    public static void shellSort_2026(int[] A_2026) {
        int n_2026 = A_2026.length;
        int gap_2026 = n_2026 / 2;

        while (gap_2026 > 0) {
            for (int i_2026 = gap_2026; i_2026 < n_2026; i_2026++) {

                int temp_2026 = A_2026[i_2026];
                int j_2026 = i_2026;

                while (j_2026 >= gap_2026 &&
                       A_2026[j_2026 - gap_2026] > temp_2026) {

                    A_2026[j_2026] = A_2026[j_2026 - gap_2026];
                    j_2026 = j_2026 - gap_2026;
                }

                A_2026[j_2026] = temp_2026;
            }

            gap_2026 = gap_2026 / 2;
        }
    }

    public static void main(String[] args_2026) {

        int[] data_2026 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray_2026(data_2026);

        shellSort_2026(data_2026);

        System.out.print("Sesudah (Shell Sort): ");
        printArray_2026(data_2026);
    }

    public static void printArray_2026(int[] arr_2026) {
        for (int i_2026 : arr_2026) {
            System.out.print(i_2026 + " ");
        }
        System.out.println();
    }
}