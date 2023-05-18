package chap_06;

public class GetHidden {
    public static String getHiddenData(String data, int index) {
        //개인정보를 비공개로 전환하는 메소드 작성
        //substring()를 이용해서 문자열의 일부를 자르자
        String hidden = data.substring(0,index);

        //나머지 자른 글자는 *로 출력하게 만들어주기
        for (int i = 0; i < data.length()-index; i++) {
            hidden = hidden + "*";

        }
        return "";

    }


    public static void main(String[] args) {
        String name = "김도하";
        String ssn = "123456-1234567";
        String phone = "010-2489-0387";

        System.out.println("이름 :" + getHiddenData(name, 2));
        System.out.println("주민등록번호 :" + getHiddenData(ssn, 9));
        System.out.println("폰 번호 :" + getHiddenData(phone, 10));

    }

}
