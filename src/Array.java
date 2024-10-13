public class Array {
    public static void main(String[] args) {
//        int[] students = new int[5]; // 배열 변수 선언
        int[] students = new int[] {90, 80, 70};

//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;

        for(int i = 0; i < 3; i++) System.out.println(students[i] + "점");

        // 2차원 배열
        int[][] arr = new int[2][3];
        int count = 1;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = count++;
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
