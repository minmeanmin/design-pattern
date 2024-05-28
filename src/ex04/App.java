package ex04;

/**
 * 풀링 : Pooling (객체를 10개 유지하는 기법)
 */
public class App {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Doorman doorman = Doorman.getInstance(); // 이렇게 get이 돼있으면 instances객체만 호출이 가능하다.
        doorman.쫒아내(tiger);
    }
}
