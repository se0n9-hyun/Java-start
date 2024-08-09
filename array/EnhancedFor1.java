package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5};

        // 일반 for문
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문 -> 배열을 처음부터 끝까지 순서대로 탐색하고 싶을 때 사용
        for(int number : numbers){ // iter 단축키
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우 -> 증가는 index값이 필요한 경우
        for(int i = 0; i < numbers.length; i++){
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
