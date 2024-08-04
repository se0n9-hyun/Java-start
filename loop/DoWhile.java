package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        do { // 조건에 상관 없이 한 번은 코드를 실행한다.
            System.out.println("현재 숫자는 = " + i);
            i++;
        } while (i < 3);
    }
}