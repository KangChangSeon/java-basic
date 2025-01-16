package Day07;

import java.util.Scanner;

class Car{
    String color;
    void colorReturn(){
        System.out.println("자동차 색은 " + color);
    }
}

public class TestClass {
    public static void main(String[] args) {
        int num = 1;
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";

        car1.colorReturn();
        car2.colorReturn();
    }
}
