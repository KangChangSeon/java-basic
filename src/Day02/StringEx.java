package Day02;

public class StringEx {
    public static void main(String[] args) {
        // ''로 감싼 문자는 char => 정수 타입
        // ""로 감싼 여러개의 문자들은 유니코드로 변환되지 않는다.

        char v1 = 'a';       // Stack 에 저장됨
        String v2 = "홍장군"; // Literal Pool 에 저장됨

        String v3 = new String("홍길동");

        System.out.printf("%c %s %s\n",v1,v2,v3);
        System.out.println(v3.hashCode()); // char는 해쉬코드 자체가 없음
        System.out.println(v2.hashCode());
        String v4 = "홍장군";
        System.out.println(v4.hashCode()); // 이미 있는 값은 재할당 하지 않는다.
    }
}
