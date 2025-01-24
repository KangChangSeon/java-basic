class Animal{
    void eat(){
        System.out.println("eat");
    }
    void sound(){};
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        a.sound();
        a.eat();
        b.sound();
        b.eat();
    }
}