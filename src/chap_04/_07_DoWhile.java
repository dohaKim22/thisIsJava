package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25; //전체 거리
        int move = 0; //현재 이동거리
        int height = 2; //키
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            ;
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착하였습니다. ");


        //Do WHile 반복문
        do {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리 : " + move);
            move +=3;

        }while (move + height < distance);
        System.out.println(" 도착했습니다. ");
        }
    }
