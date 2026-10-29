import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }
        System.out.println("The strings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}