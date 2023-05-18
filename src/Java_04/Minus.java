package Java_04;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Minus {
    public static void Minus() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력 : ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        int result = a - b;

        if (result < 0) {
            System.out.println("첫번째 값이 두번째 값보다 더 작습니다");


        } else {
            System.out.println(result);

        }
    }

        public void Minus2(){
            int a2, b2;
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("정수를 입력 : ");
            a2 = scanner2.nextInt();
            b2 = scanner2.nextInt();

            int result2 = a2 - b2;

            if (result2 < 0) {
                System.out.println("첫번째 값이 두번째 값보다 더 작습니다");


            } else {
                System.out.println(result2);

            }

        }
        public static void main(String[] args){
            //Minus();
            Minus nes = null;
            nes = new Minus();
            System.out.println(nes);
            nes.Minus2();




        }

    }

