package Day01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        문제. for 문을 이용해서 1 ~ 100까지의 합을 구하는 결과 출력


//        1. 데이터 자유 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 x의 합을 구할 때, x의 값을 입력하세요.");
        int b = sc.nextInt(); // 100 입력
        int sum = 0;

//        2. 데이터 처리
        for (int i = 1; i <= b; i++) {
//        3. 데이터 결과 저장
            if(i%2==0){
                sum+=i;
            }
        }

//        4. 결과 출력
        System.out.println("결과값 = "+ sum);

        sc.close();
    }
}
