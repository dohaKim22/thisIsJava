package chap_04;
import java.util.Scanner;
////하루 할일
    class Day {
        private String work; //하루 할 일을 나타내는 문자열 선언
        public void set(String work){
            this.work = work;
        }
        public String get(){
            return work;
        }
        public void show(){
            if(work == null) System.out.println("없습니다.");
            else System.out.println(work + "입니다.");
        }
    }
//이번달 할 일
    class MonthSchedules {
    private Scanner schedule;
    private Day days[];

    MonthSchedules (int a) {
        this.days = new Day[a];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
        schedule = new Scanner(System.in);
    }

    private void input() {
        System.out.print("1-30일까지 날짜 입력하기:");
        int arrCnt = schedule.nextInt();
        System.out.print("할일:");
        String work = schedule.next();
        days[arrCnt].set(work);
    }

    private void view() {
        System.out.print("1-30일까지 날짜 입력하기: ");
        int arrCnt = schedule.nextInt();
        System.out.print(arrCnt + "일의 할일은 ");
        days[arrCnt].show();
    }

    private void finish() {
        System.out.println("프로그램 finish");
        schedule.close();
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int select = schedule.nextInt();
            if (select == 1) {
                input();
            } else if (select == 2) {
                view();
            } else if (select == 3) {
                finish();
                return;
            }
        }}
}

    public class MonthSchedule {

        public static void main(String[] args) {
            MonthSchedules monthSchedule = new MonthSchedules(30);
            monthSchedule.run();
        }

    }

