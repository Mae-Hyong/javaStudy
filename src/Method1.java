import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("add 수행한 값: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
