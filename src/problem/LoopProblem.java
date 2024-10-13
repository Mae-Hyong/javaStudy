package problem;

public class LoopProblem {
    public static void main(String[] args) {
        // 문제 1
        int count = 0;
        while (count < 3) {
            count++;
            System.out.println("while: " + count);
        }
        for (count = 1; count <= 3; count++) System.out.println("for: " + count);
        System.out.println("");

        // 문제 2
        int num = 2;
        int i = 1;
        while (i <= 3){
            System.out.println(num);
            num += 2;
            i++;
        }
        System.out.println("");

        // 문제 3
        for(i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}
