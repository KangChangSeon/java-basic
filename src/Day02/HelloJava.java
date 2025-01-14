package Day02;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        callName();
        String eat = callStringName();
        eat = eat + "맛있다 냠냠";

        callStringParam(eat);
    }

    public static void callName(){
        System.out.println("내 이름을 불러죠");
    }

    public static String callStringName(){
        String name = "라면";
        return name;
    }

    public static void callStringParam(String eat){
        System.out.println(eat+"callString Pram 처리 완료");
    }

}