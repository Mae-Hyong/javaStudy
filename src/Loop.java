public class Loop {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (i < 3) {
            i++;
            sum += i;
            System.out.println("현재 sum: " + sum);
        }
        System.out.println("종료");

        System.out.println("");
        int count = 10;
        do {
            System.out.println("현재 count: " + count);
            System.out.println("실행");
        } while (count == 0);

        System.out.println("");
        for (int a = 1; a <= 3; a++) System.out.println("현재 a: " + a);
        int total = 0;
        for (i = 1; i <= 3; i++) {
            total += i;
            System.out.println("현재 total: " + total);
        }
    }
}
