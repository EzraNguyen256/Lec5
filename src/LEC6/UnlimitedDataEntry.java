import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            numbers.add(num);
            sum += num;
        }
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);
    }
}
