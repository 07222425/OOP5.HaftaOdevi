import java.util.ArrayList;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a sequence of numbers ending with 0:");
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        System.out.println("The largest number is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}