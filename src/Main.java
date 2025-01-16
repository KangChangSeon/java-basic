import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Month = new int[12];
        Month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y = 0;
        int m = 0;

        while (true) {
            y = scanner.nextInt();
            m = scanner.nextInt();
            if (m == 0 || m<0 || m>12) {
                System.out.print("YEAR = MONTH = ");
                System.out.println("잘못 입력하였습니다.");
                break;
            }
            if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                System.out.print("YEAR = MONTH = ");
                System.out.print("입력하신 달의 날 수는 29일입니다.");
                System.out.println();
            }else{
                System.out.print("YEAR = MONTH = ");
                System.out.printf("입력하신 달의 날 수는 %d일입니다.", Month[m - 1]);
                System.out.println();
            }
        }


        scanner.close();
    }
}
