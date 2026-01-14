package ch02.sec13;

import java.util.Scanner; // Scanner만 입력한 상태에서 Alt+Enter하면 외부에 있는 자바/유틸/스캐너 클래스를 임포트됨

// p.73
public class ScannerExample {
    public static void main(String[] args){
        // 콘솔에서 사용자 입력을 받을 수 있게 도와주는 객체
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("x값 입력: ");
            String strX = scanner.nextLine(); // 값을 입력할때까지 while 문 도는 중
            int x = Integer.parseInt(strX); // scanner.nextLine에 입력한 값이 string으로 저장됐고 그걸 int로 변환

            //System.out.println("x: " + x);

            System.out.print("y값 입력: ");
            //int y = scanner.nextInt();
            String strY = scanner.nextLine(); // 값을 입력할때까지 while 문 도는 중
            int y = Integer.parseInt(strY);

            int result = x + y;
            System.out.printf("%d + %d = %d\n", x, y, result);

            while (true){
                // 무한 반복문
                System.out.print("문자열 입력: ");
                String data = scanner.next();
                if(data.equals("q")){ //자바의지랄같은지점: 문자열 비교 ==으로 안함. "data에 담긴값이 q와 같다면"
                    break; // q 입력할때까지 계속 반복!!!!
                }
                System.out.println("출력 문자열: " + data);
                System.out.println(); //개행처리
            }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("에러발생!");
        }
        System.out.println("----끝----"); // 이렇게 오류 상황까지 고려하는 걸 감안해야하긴 함.
    }
}
