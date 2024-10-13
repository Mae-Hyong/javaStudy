public class Operator {
    public static void main(String[] args) {
        int a = 2, b = 0;
//        System.out.println(a/0); <- 오류 발생

        String result = "Hello" + "Java";
        String result1 = "a + b = " + 10;
        System.out.println(result);
        System.out.println(result1);

        System.out.println(a);
        ++a; // a = a + 1 역할을 함.
        System.out.println(a);
    }
}
