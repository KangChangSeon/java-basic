package Day04;

public class LigicalOperatorEx {
    public static void main(String[] args) {
        // 논리연산자 ( && 논리곱, || 논리합, ^ 베타적논리합, ! Not )

        int charCode = 'A'; // 65 ~ 90 대문자 범위 A~Z

        // charCode 변수에 들어있는 값이 대문자인지 소문자인지를 검증하고 싶다.

        if(charCode >= 65 && charCode <= 90){
            System.out.println("알파벳 대문자 이군요.");
        } else if(charCode >= 97 && charCode <= 122){
            System.out.println("알파벳 소문자 이군요.");
        } else if(charCode >= 48 && charCode <= 57){
            System.out.println("0~9 사이의 숫자값이군요.");
        }

        int value = 6;
        // value 변수의 값이 짝수인지 홀수인지 판별하는 구문을 작성하세요
        System.out.println(value % 2 == 0 ? "짝수" : "홀수");

        // value 변수의 값이 2의 배수이거나 3의 배수인지를 확인하는 구문을 작성하세요
        System.out.println(value % 2 ==0 || value % 3 == 0
                ? "2또는 3의 배수입니다" : "2또는 3의 배수가 아닙니다");

    }
}
