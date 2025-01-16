package Day07;
// 자바의 문자열은 String 객체로 생성된다.
/*
    String name;
    String hobby;
    name = "신세계"; -> 문자열 리터럴 표현으로 값을 할당할 수 있다.
                       문자열은 String 객체로 생성되고, 객체의 번지가 name(참조변수) 할당.
 */

public class StringEx {
    public static void main(String[] args) {
        String name1 = "신세계";
        String name2 = "신세경";

        String name3 = new String("신세계");
        String name4 = new String("신세경");
        String name5 = new String("하하하");
        String name6 = "하하하";

        System.out.println(name1.hashCode() + " " + name2.hashCode());
        System.out.println(name3.hashCode() + " " + name4.hashCode());
        System.out.println(name5.hashCode() + " " + name6.hashCode());
//        결과 값 -> 상수 풀에서 이미 있는 문자열은 그대로 들고 옴
//        49519980 49519973
//        49519980 49519973
//        54233688 54233688

        System.out.println(name6.equals(name6));
        System.out.println(name6.equals(name4));
//        true
//        false
    }
}
