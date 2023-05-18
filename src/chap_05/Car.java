package chap_05;

public class Car {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = true;
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        if(fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson ) {
            fee /=2;

        }
        System.out.println("주차요금은 " + fee + "입니다.");
    }
}

