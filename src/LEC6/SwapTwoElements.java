package LEC6;

public class SwapTwoElements {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        swap(arr, 0, 2);
        for (int n : arr) System.out.print(n + " ");
    }
}
