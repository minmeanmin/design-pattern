package ex00;

/**
 * 목표 : heap, stack, static
 * https://www.youtube.com/watch?v=QRjWR5Uh2M
 * <p>
 * 1. JVM은 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM은 static 메모리에서 main 메서드를 찾아서 실행한다.
 * 3. JVM의 생명 주기는 main 메서드의 코드 줄 (Queue)
 * 4. heap의 동적메모리 할당
 * 5. 메서드 실행시에 stack이 열린다.
 */

class Animal {
    static String name = "강아지";

    void speak() { // speak 메서드 스택 생성
        String sound = "멍멍"; // 지역 변수
        System.out.println(sound);
    } // speak 메서드 스택 소멸

}

public class Mem01 {
    public static void main(String[] args) {
        Animal a = new Animal(); // name,speak가 뜬다.(각 이름만 메모리에 뜬다. 내용은 호출했을 때 메모리에 뜬다.)
        a.speak();
        System.out.println(a.name);
    }
}
