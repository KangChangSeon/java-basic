package Day13.inheritance04;

public class Child extends Parent {
    int number;


    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        System.out.println(p.name + " " + p.age);
        System.out.println(c.number + " " + c.age + " " + c.name);

        // 업캐스팅 --> 자식에서 부모로
        Parent p1 = (Parent) c;
        System.out.println(p1.name + " " + p1.age);
        // 다운캐스팅 --> 부모에서 자식으로
        Child c1 = (Child) p1;
        System.out.println(c1.number + " " + c1.age + " " + c1.name);

    }
}