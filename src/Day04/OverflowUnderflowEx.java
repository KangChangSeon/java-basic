package Day04;

public class OverflowUnderflowEx {
    public static void main(String[] args) {
        byte b1 = 125;
        for(int i=0; i<5; i++){
            System.out.println(b1);
            b1++;
        }
//        >> 125 126 127 -128 -127

        // 사과 1개를 0.1 단위의 10조각으로 보고, 그 중 7조각을 학생들에게 나누어 주고 남은 조각을 출력하려고 합니다.

        int apple = 1;
        double piece = 10;

        int stuNum = 7;
        double result = apple - piece * stuNum;
        System.out.println(result);

        int totalPieces = apple * 10;
        result = totalPieces - stuNum;

        System.out.println("10조각에서 남은 조각 : " + result);
        System.out.println("사과 1개에서 남은 양은 : " + result/piece);

        // 연산 과정 중 발생하는 오버플로우와 언더플로우는 기대값과는 다를 수 있으므로
        // 타입의 범위 내에서 연산이 수행되도록 신경써야 합니다. 만약 정수에서 발생할
        // 가능성이 있다면 long 타입으로 연산하도록 합니다.
    }
}
