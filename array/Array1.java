package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        System.out.println(students); // @ 앞의 [I는 int형 배열 뜻한다. @ 뒤의 16진수는 참조값(주소값)을 뜻한다.

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 출력
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
