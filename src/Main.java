import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;
        while(true){
            int num = scanner.nextInt();
            sum += num;

            if(num==0){
                avg = (double)sum/ count;
                System.out.println("입력된 자료의 개수 = " + count);
                System.out.println("입력된 자료의 합계 = " + sum);
                System.out.printf("입력된 자료의 평균 = %.2f",avg);
                break;
            }
            count++;
        }

    }
}
