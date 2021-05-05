package sort;

public class quick_sort {
    public static void quickSort(int[] arr, int low, int high) {
        int i = low, j = high;
        int temp;
        if (i < j) {
            temp = arr[i];
            while (i != j) {
                while (j > i && arr[j] >= temp) --j;
                arr[i] = arr[j];
                while (i < j && arr[i] <= temp) ++i;
                arr[j] = arr[i];
            }
            arr[i] = temp;
            quickSort(arr, low, i - 1);
            quickSort(arr, j + 1, high);

        }
    }

    public static void main(String[] args) {
        int[] arr = {-5, 9, 16, -8, 0, 1, 2, 1, 13, 55, -5};
        quickSort(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}