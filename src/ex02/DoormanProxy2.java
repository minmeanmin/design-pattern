package ex02;

public class DoormanProxy2 { // 추천하는 코드

    private final Doorman doorman; // final을 붙이면 객체가 초기화 될 때 값이 있어야 한다.(new할 때 값이 필요하기 때문에)

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫒아내(Animal a) {
        System.out.println("지갑 검사");
        doorman.쫒아내(a);
    }
}
