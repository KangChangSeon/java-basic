import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;

        double[] weights = new double[6];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextDouble();
            sum += weights[i];
            count ++;
        }
        avg = sum / (double)count;
        System.out.printf("%.1f",avg);
        sc.close();
    }
}
