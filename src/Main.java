import java.util.Scanner;

class Account {
    private int balance;
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1_000_000;

    public int getBalance() {return balance;}

    public void setBalance(int newBalance) {
        if (newBalance >= MIN_BALANCE && newBalance <= MAX_BALANCE) {
            balance = newBalance;
        }
    }
}

class BankApplication{
    Account[] accounts = new Account[100];
    Scanner sc = new Scanner(System.in);
    int choose = 0;

    public void run(){
    while(true){
        System.out.println("----------------------------------------------------");
        System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
        System.out.println("----------------------------------------------------");
        System.out.print("선택 > ");
        choose = sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("----------");
                System.out.println("게좌생성");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                System.out.print("계좌주: ");
                System.out.print("초기입금액: ");
                System.out.println("결과 : 계좌가 생성되었습니다.");
            case 2:
                System.out.println("----------");
                System.out.println("게좌목록");
                System.out.println("----------");
            case 3:
                System.out.println("----------");
                System.out.println("예금");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                System.out.print("입금액: ");
            case 4:
                System.out.println("----------");
                System.out.println("출금");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                System.out.print("출금액: ");
                System.out.println("결과 : 출금이 성공되었습니다.");
            case 5:
                System.out.println("프로그램 종료");
                break;

    }
        }

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
