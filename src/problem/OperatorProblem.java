package problem;

public class OperatorProblem {
    public static void main(String[] args) {
        // 문제 1
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average);

        // 문제 2
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double valSum = val1 + val2 + val3;
        double avg = sum / 3;

        System.out.println(valSum);
        System.out.println(avg);

        // 문제 3
        int score = 80;
        boolean result = score >= 80 && score <= 100;

        System.out.println(result);
    }
}
