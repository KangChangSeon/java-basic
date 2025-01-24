package Day13.inheritance02;

public class Phone {
    // 멤버 변수
    private String lastMessage;


    private String bander;
    private String model;


    private String color;

    public Phone(){};
    public Phone(String bander, String model, String color) {
        this.bander = bander;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getBander() {
        return bander;
    }
    public String getModel(){
        return model;
    }


    // 멤버 메소드

    // 벨이 울린다.
    void bell(){
        System.out.println("벨이 울린다.");
    }

    // 음성을 전송한다.
    public String sendVoice(String message){
        this.lastMessage = message;
        System.out.println("전송할 음성입니다 : " + message);
        return message;
    }
    public String sendVoiceTransfer(){
        return lastMessage;
    }

    // 전송된 음성을 상대방이 받을 수 있다.
    public void receiveVoice(){
        sendVoiceTransfer();
        System.out.println("전송된 음성입니다 : " + lastMessage);
    }

    // 벨이 울리면 전화를 받는다.
    public void hangOn(){
        System.out.println("전화를 받는다.");
    }

    // 통화가 끝나면 전화를 끊는다
    public void hangUp(){
        System.out.println("전화를 끊는다.");
    }


}
