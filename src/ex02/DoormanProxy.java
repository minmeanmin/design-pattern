package ex02;

public class DoormanProxy extends Doorman {

    public void 쫒아내(Animal a) {
        System.out.println("지갑 검사");
        super.쫒아내(a);
    }
}
