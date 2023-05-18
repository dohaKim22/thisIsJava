package chap_05;

public class Chicken {
    public static void main(String[] args) {
        int max = 20;
        for (int i = 1; i <=50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if(i == max){
                System.out.println("주문하신 치킨이 매진 되었습니다.");

            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
