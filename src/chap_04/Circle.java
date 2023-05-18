package chap_04;

import java.util.Scanner;
public class Circle {
    static double PI=3.14;
    int radius;

    public double get_Area() {
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("원의 반지름을 입력 :");
        circle.radius = scanner.nextInt();

        System.out.println("원의 면적은 :" + circle.get_Area());
        scanner.close();


    }
}
