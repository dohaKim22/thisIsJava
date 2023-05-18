package Java_java;

public class Person {
    //파이널 필드로 주민등록과 국적을 초기화 하자
    final String nation = "korea";
    final String ssn;
    String name;

    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }

    public static void main(String[] args) {
         Person per1 = new Person("123456-1234567" , "김도하");

        System.out.println(per1.nation);
        System.out.println(per1.name);
        System.out.println(per1.ssn);

        //국적이랑 주민등록번호는 수정이 불가 하지만 이름은 final필드로 저장을안해서 수정이 가능하다
        per1.name = "을지문덕";
    }
}
