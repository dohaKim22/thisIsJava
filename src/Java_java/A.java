package Java_java;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    public A(boolean b) {} //public 접근 제한
    A(int b) { } //default 접근제한
    private A(String s) {}//private 접근제한

    }

