package Java_java;

public class HanKookTire extends Tire {
    public HanKookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire 펑크 ***");
            return true;
        }else {
            System.out.println("*** " + location + "KumhoTire 펑크 ***");
            return false;
        }
    }

    //생성자
}
