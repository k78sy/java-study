package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()* 6.0 + 1);
        System.out.println("num:" +num);
        switch (num){
//            case 3: // 순서 관련 없음. break문을 쓰지 않는 이상
//                System.out.println("3번이 나왔습니다.");
//                break;
//            case 1: // equal (==)만 가능
//                System.out.println("1번이 나왔습니다.");
//                //작업
//                break; // break만나야 switch문 종료
//            case 2:
//                System.out.println("2번이 나왔습니다.");
//                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝수");
                break;
            case 1:
            case 3:
            case 5:
                System.out.println("홀수");
                break;
        }
    }
}
