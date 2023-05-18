package Java_java;

public class areaRectangle {
     static double pi = 3.141592;
     static int plus(int x, int y){ return x+y;}
     static int minus(int x, int y) {return x-y;}

    public static void main(String[] args) {
        double result1 = 10 * 10 * areaRectangle.pi;
        System.out.println("reuslt1 :" + result1);

        int result2 = areaRectangle.plus(10, 5);
        System.out.println("result2" + result2);

        int result3 = areaRectangle.minus(10, 5);
        System.out.println("result3" + result3);

    }

}
