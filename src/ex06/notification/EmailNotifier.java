package ex06.notification;

public class EmailNotifier implements Notifier {

    private Notifier notifier;

    public EmailNotifier(Notifier notifier) { // 추상적인 것에 의존 중이다.
        this.notifier = notifier;
    }

    public EmailNotifier() {}

    // 재정의
    public void send(){
        if(notifier != null) notifier.send(); // 매개변수의 객체를 선 실행.
        System.out.println("이메일 알림");
    }
}
