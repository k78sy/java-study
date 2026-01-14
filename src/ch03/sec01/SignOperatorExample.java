package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args){
        int x = 100;
//        x = x * -1;
        x = -x; // 같은 효과
        // 값을 바꾸려면 대입연산자가 있어야함!
        System.out.println("1. x: " + x); // -100
        System.out.println("2. -x: " + -x); // 100 // x 값을 바꾼 적은 없음.
        x = -x;
        System.out.println("3. x값을 바꾼 후 x: " + x); // -100
    }
}
