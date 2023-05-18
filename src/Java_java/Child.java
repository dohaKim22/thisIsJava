package Java_java;

public class Child extends Parent{
    @Override
    public void method2() {
        System.out.println("Child=method2()");
    }
    public void method3() {
        System.out.println("Child=method3()");
    }

    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();


    }
}
