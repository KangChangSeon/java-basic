package Day04;

public class CompareOperatorEx {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 10;
        boolean result1 = false;

        // 1. n1과 n2 가 값이 같은지를 비교하여 결과를 boolean result1에 저장후 result1 출력
        // 2. n1과 n2 가 값이 다른지를 비교하여 결과를 boolean result1에 저장후 result1 출력
        // 3. n1과 n2 가 값이 n1이 n2보다 작거나 같은지를 비교하여 결과를 boolean result1에 저장후 result1 출력
        // 4. n1과 n2 가 값이 n1이 n2보다 크거나 같은지를 비교하여 결과를 boolean result1에 저장후 result1 출력
        // 5. n1과 n2 가 값이 n1이 n2보다 작은를 비교하여 결과를 boolean result1에 저장후 result1 출력
        // 6. n1과 n2 가 값이 n1이 n2보다 큰지를 비교하여 결과를 boolean result1에 저장후 result1 출력

        if(n1==n2) {
            result1 = (n1==n2);
            System.out.println(result1);
        } else if(n1!=n2) {
            result1 = (n1!=n2);
            System.out.println(result1);
        } else if(n1 <= n2){
            result1 = (n1<=n2);
            System.out.println(result1);
        } else if(n1 >= n2){
            result1 = (n1>=n2);
            System.out.println(result1);
        } else if(n1 < n2){
            result1 = (n1<n2);
            System.out.println(result1);
        } else if(n1 > n2){
            result1 = (n1>n2);
            System.out.println(result1);
        }
    }
}
