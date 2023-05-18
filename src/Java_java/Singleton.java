package Java_java;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        //컴파일 에러임
//        Singleton obj1 = new SIngleton();
//        Singleton obj2 = new SIngleton();

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체 입니다.");


        } else {
            System.out.println("다른  Singleton 객체 입니다.");
        }
    }
}