package Day12;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        // 자바 Calendar 클래스 : 컴퓨터에서 제공하는 날짜, 요일, 시간을 얻어올 때 사용.
        Calendar now = Calendar.getInstance(); // Calendar 객체 얻기
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 0부터 시작
        int day = now.get(Calendar.DAY_OF_MONTH); // 1~7 사이의 숫자
        int week = now.get(Calendar.DAY_OF_WEEK);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int secondsOfDay = now.get(Calendar.SECOND);

        // 요일은 1~7 사이의 숫자입니다. 코드 가독성을 위해 열거 상수로 변환해서
        // Week 변수에 대입해서 오늘이 무슨 요일인지 알고 싶다.

        switch (week) {
            case 1: today = Week.Sunday; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if (today == Week.THURSDAY) {
            System.out.println("조별 스터디가 있는 날입니다.");
        }else{
            System.out.println("매일 매일 자바 혼공");
        }

        System.out.println(year + "/" + month + "/" + day + " " + today + " " + hour + ":" + minute + ":" + secondsOfDay);
    }
}
