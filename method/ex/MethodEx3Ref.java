package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        balance = deposit(balance, 1000);

        // 출금 2000
        balance = withdraw(balance, 2000); // main 코드만 보고 어떤 기능을 하는 코드인지 알 수 있음 -> 좋은 코드 "맛있다~"

        // 최종 잔액
        System.out.println("최종 잔액: " + balance + "원");

        // 이런 refactoring을 메서드 추출(Extract Method)이라고 한다. -> 구조적으로 읽기 쉽고 유지보수하기 좋음
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
