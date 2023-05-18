package chap_04;
import java.util.Scanner;
public class StaticMember {
   private static double rate; //환율

   public static double wonToDollars (double won) { //원화를 달러를 변환하는 메소드 만들기
       return won/rate;
   }
   public static double dallarsToWon (double dallars) { //달러를 원화로 변환하는 메소드 만들기
       return dallars * rate;
   }

    public static void main(String[] args) {
       StaticMember staticMember = new StaticMember(); // 생성자를 불러오고
       Scanner scanner = new Scanner(System.in); // 스케너 받고

        System.out.println("환율을 입력하세요 :");
        rate = scanner.nextDouble();  // 환율 입력받고

        System.out.println("1을 입력하면 원화를 달러로 변환");
        System.out.println("2를 입력하면 달러를 원화로 변환");
        System.out.println("선책: ");

        int choice = scanner.nextInt(); //이프 구문을 만들기 위해서 choice라는 걸 입력 받고

        if (choice == 1) {  // 1을 받으면 원화를 달러로 2를 받으면 달러를 원화로 바꾸는 조건문 입력
            System.out.println("변환할 원화를 입력하세요 : ");
            double won = scanner.nextDouble();
            double dallars = wonToDollars(won);
            System.out.println(dallars);
        } else if (choice == 2) {
            System.out.println("변환할 달러를 입력하세요 :");
            double dallars = scanner.nextDouble();
            double won = dallarsToWon(dallars);
            System.out.println(won);
        }else {
            System.out.println("선택을 잘못 하셨습니다.");
        }
        scanner.close();
    }
   }
