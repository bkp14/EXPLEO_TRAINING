package oops;
final class Animal {

    void sound() {
        System.err.println("Animal sound");
    }
}
public class FinalClassDemo {
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.sound();
    }
}
