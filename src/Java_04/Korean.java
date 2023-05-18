package Java_04;

public class Korean {
    String nation = "대한민국";
    String ssn;
    String name;

    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public static void main(String[] args) {
        Korean k1 = new Korean("김도하", "1234-5678");
        System.out.println("k1의 이름 :" + k1.name);
        System.out.println("k1의 주민등록번호 :" + k1.ssn);

    }
}

