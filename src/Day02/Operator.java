package Day02;

public class Operator {
    public static void main(String[] args) {
        int kor = 77;
        int eng = 87;

        int sum;
        double avg;

        total(kor,eng);
        avg(kor, eng);
    }

    public static void total(int a, int b){
        int sum = a+b;
        System.out.println("총점 = " + sum);
    }

    public static void avg(int a, int b){
        double avg = (a + b) / 2;
        System.out.println("평균 = " + avg);
    }
}
