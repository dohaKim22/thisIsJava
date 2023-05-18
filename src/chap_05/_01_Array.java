package chap_05;
public class _01_Array {
    public static void main(String[] args) {

        String coffeeRoss = "아메리카노";
        String coffeeRachel = " 카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸피노";

        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        //배열 선언 방법
        // String[] coffees = new String[4];

        //두번째 방법

        //String coffees[] = new String[4];
 //        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";
//        세번째 방법

        String[] coffees = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};
    }
}
