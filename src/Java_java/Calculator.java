package Java_java;

public class Calculator { //정적멤버
    //정사각형의 넓이
    double areaRectangle(double width) {
       return width * width;
    }
    //직사각형의 넓이

    double areaRectangle(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        //정사각형의 넓이 구하기
        double result1 = myCal.areaRectangle(10);
        System.out.println("정사각형의 넓이 : " + result1);

        double result2 = myCal.areaRectangle(10, 20);
        System.out.println("직사각형의 넓이 : " + result2);
    }
}
