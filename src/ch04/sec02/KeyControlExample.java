package ch04.sec02;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        root:
        while(true){
            System.out.println("------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("------------------");
            System.out.println("선택: ");
            String choice = scanner.nextLine();
            // 3문자열 들어오면 반복문 종료
//            if("3".equals(choice)){ // 에러 절대 안터짐
//                break;
//            } else if(choice.equals("1")){ // 에러날 가능성이 있음
//                speed++;
//            } else if(choice.equals("2")){
//                speed--;
//            }
            switch (choice){
                case "3": break root;
                case "1":
                    speed++;
                    break;
                case "2":
                    speed--;
                    break ;
            } // equals 안써도 되는 스위치문 선언
            // 1문자열 들어오면 speed 증가
            // 2문자열 들어오면 speed 감소
            System.out.println("speed: " + speed);
        }
        System.out.println("----End----");
    }
}
