package loop;

public class For1 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) { // for문 안에 선언된 변수 i는 for문 안에서만 사용할 수 있다. -> for문 밖에서 i = 2; (X)
            sum += i;
            System.out.println(" i = " + i + ", sum = " + sum)       ;
        }
    }
}