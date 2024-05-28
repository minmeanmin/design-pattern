package ex04;

/**
 * 목적 : 문지기를 메모리에 하나만 올리고 싶다.
 */
public class Doorman {

    private static Doorman instance = new Doorman(); // instance 변수는 static에 저장, new된거는 heap에 저장

    public static Doorman getInstance(){
        return instance;
    }
    private Doorman() {}

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + " 쫒아내");
    }
}
