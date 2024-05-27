package ex00;

/**
 * 목표 : 다형성, 동적 바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차
 */

abstract class Car { // new 못한다. 메모리에는 구체적인 것들만 띄울것이라서
    abstract void run(); // 추상 메서드. 몸체({})가 없다.
}

class Sonata extends Car {
    @Override
        // 재정의
    void run() {
        System.out.println("소나타가 달린다");
    } // sonata -> car

}

class Genesis extends Car {
    @Override
        // 재정의
    void run() {
        System.out.println("제네시스 달린다");
    } // genesis => car

}

public class Mem02 {

    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리에 sonata(run), car(run)가 뜨기 때문에 Car로 바꿀 수 있는 것. // Sonata s = new Sonata();도 가능하다.
        // car의 run을 호출하러 갔더니, 소나타가 run을 재정의 해서,
        // car의 run이 오버라이드(무효화) 되고, sonata의 run이 호출된다.
        // => 동적 바인딩.
        s.run();
        Car g = new Genesis(); // Genesis g = new Genesis();도 가능하다. // 메모리에 genesis(run), car(run)가 뜨기 때문에 Car로 바꿀 수 있는 것.
        g.run();
    }
}
