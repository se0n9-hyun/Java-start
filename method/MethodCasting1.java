package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); -> double형 자료를 int에 넣을 수 없음
        printNumber((int)number); // 명시적 형변환 사용
    }

    public static void printNumber(int n ) {
        System.out.println("숫자" + n);

    }
}
