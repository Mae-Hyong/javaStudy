package problem;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        // 문제 1
        Scanner scanner = new Scanner(System.in);

//        System.out.println("첫 번째 숫자: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("두 번째 숫자: ");
//        int num2 = scanner.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(num1 + " + " + num2 + " = " + sum);

        // 문제 2
        System.out.println("이름: ");
        String name = scanner.nextLine();

        System.out.print("나이: ");
        int age = scanner.nextInt();

        System.out.println("이름: " + name + ", 나이: " + age);
    }
}
