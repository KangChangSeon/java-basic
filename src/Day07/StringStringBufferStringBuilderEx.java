package Day07;
// 자바에서는 문자열을 처리할 때 자료형 클래스 (String, StringBuffer, StringBuilder)
// 문자열을 다루는데 있어 공통적으로 사용되지만, 사용 목적에 따라 쓰임새가 다르다

// 기본 자바에서는 String 객체의 값을 변경 할 수 없다. (Immutable 불변의 : 바꿀 수 없다.)
public class StringStringBufferStringBuilderEx {
    public static void main(String[] args) {
        int age = 40;
        String name = "신세계";

        String a = "Hello";

        a = "Hello"+" JAVA";
        // 참조변수 a 가 참조하는 메모리의 "Hello" 값에 "JAVA" 문자열을 더해서 String 객체의 값을 변경 시킨 것
        // 실제 메모리에서는 "Hello JAVA" 를 따로 만들고 참조변수 a를 새로운 주소값으로 할당
        // hashCode() : 객체의 메모리 번지를 이용해서 만든 해시코드를 반환한다.
        // 문자열 값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자열 데이터 객체를 대입하는 방식으로 운영하기 때문
        // ==== 불변으로 설계 된 이유 =====
        // 1. JVM 에서는 String Constrant Pool(문자열 상수풀) 운영, 문자열을 상수화(값 변경 x) 시켜서
        //    다른 변수 또는 다른 객체와 공유하게 한다.
        // 2. 데이터가 불변하다면, Multi-Thread 환경에서 동기화 문제가 발생하지 않기 때문에 안정된 서비스를 제공할 수 있다.
        // 3. 보안(Security)

        // String 주소 할당 방식 : 1. 리터럴 할당 방식   2. new String() 생성자를 활용한 할당 방식

    }
}
