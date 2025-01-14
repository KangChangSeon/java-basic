package Day04;

public class InfinityAndNaNCheckEx {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z1 = x % y; // NaN
        double z2 = x / y; // Infinity
        // Infinity 와 NaN 의 의미는 무한대의 값을 정수로 표현할 수 없다.


        // 알맞은 코드로 리펙토링 // if의 결과가 false 일 경우만 연산 진행함
        if (Double.isInfinite(z1) || Double.isNaN(z1)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z1 + 2);
            System.out.println(z2);
        }
    }
}
