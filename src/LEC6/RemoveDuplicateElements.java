package LEC6;

import java.util.ArrayList;

public class RemoveDuplicateElements {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 3, 2, 1, 4, 3, 5};
        for (int n : arr) list.add(n);
        System.out.println(removeDuplicates(list));
    }
}
