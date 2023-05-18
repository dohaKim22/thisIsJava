package chap_06;

public class Audio implements RemoteControl {


    private int volume;

    public void turnOn() {
        System.out.println("Adudio를 켭니다.");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVoume(int voilume) {

    }

    public void voidturnOff() {
        System.out.println("AUdio를 끕니다.");




    }
    public void setVolume(int volume) {
        if(volume > RemoteControl.Max_VOLUME) {
            this.volume = RemoteControl.Max_VOLUME;

        }else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 불륨 ; " + volume);
    }
}
