package Facade;

public class Key implements Car {
    public void start() {
        System.out.println("Вставить ключ");
    }
    public void stop() {
        System.out.println("Вынуть ключ");
    }
}
