    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] arr = new int[10];
            int Min = 10001;
            int Max = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 100) {
                    Max = Math.max(Max, arr[i]);
                } else {
                    Min = Math.min(Min, arr[i]);
                }
            }
            if(Max==0){Max=100;}
            else if(Min==10001){Min=100;}
            System.out.println(Max + " " + Min);
            scan.close();
        }
    }
