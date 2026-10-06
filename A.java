class A {
    void show() {
        System.out.println("This is Parent class");
    }
}

class B extends A {
    void show() {
        System.out.println("This is Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}