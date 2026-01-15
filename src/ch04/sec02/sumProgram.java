package ch04.sec02;
/*
숫자를 입력해주세요 (종료 0) >> 5
숫자를 입력해주세요 (종료 0) >> 10
숫자를 입력해주세요 (종료 0) >> 3
숫자를 입력해주세요 (종료 0) >> 0

합계 18
*/

import java.util.Scanner;

public class sumProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

//        while(true){
//            System.out.println("숫자를 입력해주세요 (종료: 0)");
//            String stringData = scanner.nextLine();
//            int data = Integer.parseInt(stringData);
//
//            if("0".equals(stringData)){
//                break;
//            }else{
//                sum += data;
//            }
//        }
//        while(true){
//            System.out.print("숫자를 입력해주세요 (종료:0) : ");
//            int data = scanner.nextInt();
//            if(data==0){
//                break;
//            }else{
//                sum += data;
//            }
//        }

        while(true){
            System.out.print("숫자를 입력해주세요 (종료: 0) >> ");
            try{
                int data = scanner.nextInt();
                if(data == 0){ break;}
                sum += data;
            } catch(Exception e){
                System.out.println("숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }
        System.out.println("합계: " + sum);
    }
}
