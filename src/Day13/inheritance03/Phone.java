package Day13.inheritance03;

public class Phone {
    // 멤버 변수
    private String bander;
    private String model;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBander() {
        return bander;
    }

    private String color;

    public Phone(){
        System.out.println("Phone() 생성자 실행");
    }
}
