package Java_java;
public class Tire_car {
    //필드
    Tire frontLEftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backRightTire = new Tire("뒤오른쪽", 3);
    Tire backLeftTire = new Tire("뒤 왼쪽", 4);

    //메소드
    int run() {
        System.out.println("자동차가 달립니다.");
        if (frontLEftTire.roll() == false) {
            stop();
            return 1;
        }
        if(frontLEftTire.roll() == false) {
            stop();
            return 2;
        }
        if(backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if(backRightTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }
    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

}
