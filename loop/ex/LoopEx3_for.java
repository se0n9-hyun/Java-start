package loop.ex;

public class LoopEx3_for {
    public static void main(String[] args) {
        int max = 10;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
