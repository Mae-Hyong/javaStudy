public class If {
    public static void main(String[] args) {
        int age = 10;

        if (age <= 7) System.out.println("미취학 아동");
        else if (age <= 13) System.out.println("초등학생");
        else if (age <= 16) System.out.println("중학생");
        else if (age <= 19) System.out.println("고학생");
        else System.out.println("성인");


        int price = 10000;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
