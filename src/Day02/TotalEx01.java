package Day02;

import java.util.Scanner;

public class TotalEx01 {
    static Scanner sc = new Scanner(System.in);
    static void fourArithmetic(){
        System.out.println("a 와 b 의 값을 입력하세용");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a+b=%d\n", a+b);
        System.out.printf("a-b=%d\n", a-b);
        System.out.printf("a*b=%d\n", a*b);
        System.out.printf("a/b=%.2f\n", (double)a/b);
        System.out.println("\n");

    };
    static void Operator(){
        System.out.println("국어와 영어 점수를 입력하세용");
        int kor = sc.nextInt();
        int eng = sc.nextInt();

        System.out.printf("총점 = %d\n", kor+eng);
        System.out.printf("평균 = %.2f\n", (kor + eng) / 2.0);
    };

    public static void main(String[] args) {
        fourArithmetic();
        Operator();
    }
}
