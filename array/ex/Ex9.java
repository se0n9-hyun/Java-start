package array.ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[10];
        int[] price = new int[10];
        int count = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = input.nextInt();

            if (menu == 1) {
                if (count == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                name[count] = input.next();
                System.out.print("상품 가격을 입력하세요: ");
                price[count] = input.nextInt();
                count++;
            }
            else if (menu == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                for (int i = 0; i < count; i++) {
                    System.out.println(name[i] + " : " + price[i] + "원");
                }
            }
            else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break; 
            }
            else {
                System.out.println("잘목된 메뉴를 선택하셨습니다.");
            }
        }
    }
}