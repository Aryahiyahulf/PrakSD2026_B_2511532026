package pekan7_2511532026;

public class InsertionSort_2511532026 {

    public static void insertionSort_2026(int[] arr) {

        int n_2026 = arr.length;

        for (int i_2026 = 1; i_2026 < n_2026; i_2026++) {

            int key_2026 = arr[i_2026];
            int j_2026 = i_2026 - 1;

            while (j_2026 >= 0 && arr[j_2026] > key_2026) {

                arr[j_2026 + 1] = arr[j_2026];
                j_2026--;
            }

            arr[j_2026 + 1] = key_2026;
        }
    }

    public static void main(String[] args) {

        int arr_2026[] = {23, 70, 45, 8, 32, 56, 1};

        int n_2026 = arr_2026.length;

        System.out.print("array yang belum terurut:\n");

        for (int i_2026 = 0; i_2026 < n_2026; i_2026++) {
            System.out.print(arr_2026[i_2026] + " ");
        }

        System.out.println("");

        insertionSort_2026(arr_2026);

        System.out.print("array yang terurut:\n");

        for (int i_2026 = 0; i_2026 < n_2026; i_2026++) {
            System.out.print(arr_2026[i_2026] + " ");
        }

        System.out.println("");
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
