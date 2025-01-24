package Day13.inheritance02;

public class Main {
    public static void main(String[] args) {
        // Phone 타입으로 유선 전화 객체를 생성해서
        Phone phone = new Phone();
        // 1. 전화를 건다.
        phone.bell();
        // 2. 전화를 받는다.
        phone.hangOn();
        // 3. 메세지를 전송한다.
        phone.sendVoice("안녕");
        // 4. 메세지를 수신한다.
        phone.receiveVoice();
        // 5. 전화를 끊는다.
        phone.hangUp();

        System.out.println();

        // bander : 사과, model : 사과15 Pro, color : 화이트
        // SmartPhone을 생성하여
        SmartPhone smartPhone = new SmartPhone("사과","사과15 PRO","화이트");
        // 0. wifi를 연결하고 인터넷을 킨다.
        smartPhone.setWifi(true);
        // 1. 전화를 건다.
        smartPhone.bell();
        // 2. 전화를 받는다.
        smartPhone.hangOn();
        // 3. 메세지를 전송한다.
        smartPhone.sendVoice("스마트폰 안녕");
        // 4. 메세지를 수신한다.
        smartPhone.receiveVoice();
        // 5. 전화를 끊는다.
        smartPhone.hangUp();

        // 작성이 되면 슬랙 DM 전송해 주세요
    }
}
