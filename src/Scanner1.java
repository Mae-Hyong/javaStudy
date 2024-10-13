import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine(); // String으로 입력됨.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수 입력: ");
        int intVal = scanner.nextInt(); // Int로 입력됨.
        System.out.println("입력한 정수: " + intVal);

        System.out.print("실수 입력: ");
        Double doubleVal = scanner.nextDouble(); // Double로 입력됨.
        System.out.println("입력한 실수: " + doubleVal);
    }
}
