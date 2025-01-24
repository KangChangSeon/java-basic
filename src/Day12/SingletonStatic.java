package Day12;

public class SingletonStatic {
    private static SingletonStatic instance;
    private SingletonStatic() {}

    public static SingletonStatic getInstance() {
        // 외부에서 정적메소드인 getInstance() 호출하면 이때 초기화를 진행 (Lazy)
        if (instance == null) instance = new SingletonStatic();
        return instance;
    }

//    static { // static 블럭을 이용해 예외 처리
//        try {
//            instance = new SingletonStatic();
//        } catch (Exception e) {
//            throw new RuntimeException("싱글톤 객체 생성 오류");
//        }
//    }
}


