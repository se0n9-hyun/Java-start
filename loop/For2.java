package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) { // 무한 루프 -> while (true)와 같음
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
