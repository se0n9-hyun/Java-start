package loop.ex;

public class LoopEx3_while {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
