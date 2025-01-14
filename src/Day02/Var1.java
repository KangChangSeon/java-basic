package Day02;

import java.util.Scanner;

public class Var1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addSum();

    }

    public static void addSum(){
        int value = 10;
        int tmp = value;
        System.out.println("숫자를 입력하세요");
        value = sc.nextInt();

        int result = tmp + value;
        System.out.println("결과는 = "+ result);
    }
}
