package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args){
        int x = 3;
        int y = 5;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y: " +y);
        System.out.printf("x: %d, y: %d\n", x, y); // d:정수, f:실수, s:문자열, b:불린, c:문자
    }
}
