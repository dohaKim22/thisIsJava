package chap_05;

public class _03_Return {
    // 호텔 전화번호 void는 반환값이 없는거고 문자열을 반환해야 하니까 String을 적자.
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
       return "부산시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        //반환값, return
        String contactNumber = getPhoneNumber();
        System.out.println("호텧 전화번호는 " + contactNumber);

        String address = getAddress();
        System.out.println("호텔주소는 " + address);

        String activities = getActivities();
        System.out.println("호텔 엑티비티는 " + activities);
    }
}
