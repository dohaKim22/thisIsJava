package chap_06;

public interface RemoteControl {

    public int Max_VOLUME = 10;
    public int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVoume(int voilume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리 합니다.");

        }else {
            System.out.println("해제");
        }
    }

    //추상 메소드

}
