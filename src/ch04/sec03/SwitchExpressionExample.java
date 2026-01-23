package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()* 13.0 + 1);
        System.out.println("num: "+ num);
        String denomination = switch (num){
            case 1 -> "A";
            case 11 ->
                "J";

            case 12 -> { // 연산도 가능! 중괄호 사용
                int a= 10;
                int b = 20;
                yield "Q"; //return 대신 yield 키워드 사용
            }
            case 13 -> "K";
            default -> String.valueOf(num);
        };
        System.out.println("denomination: "+ denomination);
    }
}
