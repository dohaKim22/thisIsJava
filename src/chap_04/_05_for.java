package chap_04;

public class _05_for {
    public static void main(String[] args) {
        //반복문 for
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");

        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다" + i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);

        }
        System.out.println();
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);


        }
        System.out.println();
        for (int i = 5; i >0; i--) {
            System.out.print(i);

        }


        System.out.println();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum +=1;
            System.out.println("현재까지 총합은" +sum+ "입니다");

        }
        System.out.println("1부터 10까지의 모든 수의 총합은" +sum+ "입니다");
    }


    }

