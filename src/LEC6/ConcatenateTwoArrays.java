package LEC6;

public class ConcatenateTwoArrays {
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int index = 0;
        for (int n : a1) result[index++] = n;
        for (int n : a2) result[index++] = n;
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] result = concatenate(a1, a2);
        for (int n : result) System.out.print(n + " ");
    }
}
