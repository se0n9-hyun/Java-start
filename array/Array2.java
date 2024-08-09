package array;

public class Array2 {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50};
        // int[] students = {90, 80, 70, 60, 50}; 로 줄일 수 있다.

        for (int i = 0; i < students.length; i++) { // .length는 배열의 길이를 조회할 수 있게 해준다.
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
