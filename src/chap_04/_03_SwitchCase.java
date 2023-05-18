package chap_04;

public class _03_SwitchCase {
    public static void main(String[] args) {

        //if else문을 이용
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #!");

        int grade = 3;
        int price = 7000;
        switch (grade) {
            case 1:
                price = price + 1000;
            case 2:
                price = price + 1000;
            case 3:
                price = price + 1000;
                break;
        }

        System.out.println(grade + "등급 제품의 가격 :" + price + "원");


        int score = 95;
        if (score >= 90) {
            System.out.println("A");
        } else if (score < 90) {
            System.out.println("B");
        }


    }
}









