package ch02.sec01;

public class Mission01 {
    public static void main(String[] args){
        double d1 = Math.random();  // 이 메소드는 더블 값이 나옴
        System.out.println("d1: " + d1);

        // 5~17 0~12
        int random = (int)(Math.random() * 13.0 + 5); // 더블ㄱ 결과값을 int로 강제 형변환
//        int number = (int)random;
        System.out.println("랜덤값: " + random);
    }
}
