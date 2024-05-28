package ex06.notification;

public class SmsNotifier implements Notifier {

    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SmsNotifier() {}

    // 재정의
    public void send(){
        if(notifier != null) notifier.send(); // 매개변수의 객체를 선 실행.(기능 확장)
        System.out.println("문자 알림");
    }
}
