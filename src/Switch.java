public class Switch {
    public static void main(String[] args) {
        // 문제 1
        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);

        // 문제 2
        int coupon2 = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 받은 두 번째 쿠폰: " + coupon2);

        // 문제 3
        double rating = 7.1;

        if (rating <= 9) System.out.println("'어바웃타임'을 추천");
        if (rating <= 8) System.out.println("'토이 스토리'를 추천");
        if (rating <= 7) System.out.println("'고지랄'를 추천");

        // 문제 4
        char grade2 = 'A';

        switch (grade2) {
            case 'A' -> System.out.println("탁월한 성과");
            case 'B' -> System.out.println("좋은 성과");
            case 'C' -> System.out.println("준수한 성과");
            case 'D' -> System.out.println("향상이 필요한 성과");
            case 'F' -> System.out.println("불합격");
            default -> System.out.println("잘못된 학점");
        };

        // 문제 5
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
