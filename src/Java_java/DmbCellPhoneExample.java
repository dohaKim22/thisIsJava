package Java_java;
//자식 클래스 사용
public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "블랙", 10);

        System.out.println("모델 :" + dmbCellPhone.model);
        System.out.println("색상 :" + dmbCellPhone.color);

        System.out.println("채널 :" + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();

        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.sendVoice("네");
        dmbCellPhone.hangUP();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}
