package ex01;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Doorman doorman = new Doorman();
        doorman.쫒아내(tiger);
    }
}
