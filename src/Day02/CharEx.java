package Day02;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65; // 유니코드

        char c3 = '가';
        char c4 = 44032;

        char c = ' '; // char 타입의 변수에 어떤 문자도 대입하지 않고
                      // 초기화 할 목적으로 ''를 사용하면 컴파일 에러가 나옴
                      // 무조건 빈 공백(유니코드 32)을 포함 해야 한다.
        System.out.printf("%c %c %c %c",c1,c2,c3,c4);
    }
}
