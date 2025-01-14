package Day04;

public class SignOperatorEx {
    public static void main(String[] args) {
        // 1. 부호 연산자(변수 앞에 + 또는 -) : + 연산자는 변수 값의 부호를 바꿀 때 사용
        byte b = 100;
        System.out.println(-b);
//        >> -100
        System.out.println(-(-b));
//        >> 100

        // 2. 증감 연산자( ++, -- ) : 변수의 값을 1 증가 시키거나 1 감소 시키는 연산자
        // 변수 단독으로 증감, 감소 연산자로 사용할 경우 (앞에 붙이든 뒤에 붙이든) 결과는 동일하다.
        int x = 1;
        int y = 1;
        int result1 = ++x;
        System.out.println(x + " " + result1);
//        >> 2 2
        int result2 = x++;
        System.out.println(x + " " + result2);
//        >> 3 2
        System.out.println(result1 + " " + result2 + " " + x);
//        >> 2 2 3

        int result3 = ++x + 10;
        System.out.println(x + " " + result3);
//        >> 2 12
        int result4 = y++ + 10;
        System.out.println(y + " " + result4);
//        >> 2 11

    }
}
