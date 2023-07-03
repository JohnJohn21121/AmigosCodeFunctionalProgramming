package Recursion;

public class RecursionMain {
    public static void main(String[] args) {
        sayHi(3);
    }

    public static void sayHi(int count) {
        System.out.println("Hola maweo");
        if (count <= 1) {
            return;
        }
        sayHi(count - 1);
    }
}
