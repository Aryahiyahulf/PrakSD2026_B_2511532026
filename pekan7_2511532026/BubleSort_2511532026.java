package pekan7_2511532026;

public class BubleSort_2511532026 {

    public static void bubbleSort_2026(int[] arr_2026) {

        int n_2026 = arr_2026.length;

        for (int i_2026 = 0; i_2026 < n_2026; i_2026++) {

            for (int j_2026 = 0; j_2026 < n_2026 - i_2026 - 1; j_2026++) {

                if (arr_2026[j_2026] > arr_2026[j_2026 + 1]) {

                    int temp_2026 = arr_2026[j_2026];

                    arr_2026[j_2026] = arr_2026[j_2026 + 1];

                    arr_2026[j_2026 + 1] = temp_2026;

                    // System.out.println("data:" + arr_2026[j_2026] + " " + arr_2026[j_2026 + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr_2026[] = {23, 78, 45, 8, 32, 56, 1};

        int n_2026 = arr_2026.length;

        System.out.print("array yang belum terurut:");

        for (int i_2026 = 0; i_2026 < n_2026; i_2026++) {

            System.out.print(arr_2026[i_2026] + " ");
        }

        System.out.println("");

        bubbleSort_2026(arr_2026);

        System.out.print("array yang terurut menggunakan BubleSort:");

        for (int i_2026 = 0; i_2026 < n_2026; i_2026++) {

            System.out.print(arr_2026[i_2026] + " ");
        }

        System.out.println("");
    }
}