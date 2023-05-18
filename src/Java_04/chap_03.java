package Java_04;
//"123456-1234567" 인 경우 8자리까지 출력
public class chap_03 {
    public static void main(String[] args) {
        String id = "123456-1234567";
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0, id.indexOf("-") +2));
    }




}
