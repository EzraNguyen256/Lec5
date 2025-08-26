import java.util.ArrayList;

public class FilterEvenNumbers {
    public static ArrayList<Integer> filterEvenNumbers(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(filterEvenNumbers(arr));
    }
}
