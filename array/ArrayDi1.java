package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = { // new int[][]를 생략할 수 있다.
                {1, 2, 3},
                {4, 5, 6}
        }; // 2행 3열

        for (int row = 0; row < arr.length; row++) { // 행의 길이 -> arr.length // arr 배열은 {{},{}} 안의  2개의 배열 요소를 가진다.
            for (int column = 0; column < arr[row].length; column++) { // 열의 길이 -> arr[row].length //arr[0]은 {1, 2, 3}을 뜻한다.
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
