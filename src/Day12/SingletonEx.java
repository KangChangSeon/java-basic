package Day12;

class Singleton {
//    private static Singleton instance;
//    private Singleton() {}
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;

    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }

}

public class SingletonEx {
    public static void main(String[] args) {
        // 정적 메소드 getInstance() 해서 싱글톤 객체 얻음
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if(s1 == s2) {
            System.out.println("같은 객체 참조 " + s1.toString() + " " + s2);
        }else{
            System.out.println("참조 값이 다름 ");
        }
    }
}
