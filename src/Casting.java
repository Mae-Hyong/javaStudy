public class Casting {
    public static void main(String[] args) {
        // 자동 형변환
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal;
        System.out.println("longVal = " + longVal);

        doubleVal = intVal;
        System.out.println("doubleVal = " + doubleVal);

        doubleVal = 2000000000L;
        System.out.println("doubleVal2 = " + doubleVal);
        System.out.println();

        // 명시적 형변환
        long overIntVal = 2147483648L;
        double dVal = 1.5;
        int iVal = 0;

        iVal = (int) dVal;
        System.out.println(iVal);
        System.out.println((int) 10.5);

        System.out.println("overIntVal: " + (int)overIntVal);
    }
}