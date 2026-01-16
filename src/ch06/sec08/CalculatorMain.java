package ch06.sec08;

public class CalculatorMain {
    public static void main(String[] args){
        // calculator 객체 생성
        Calculator cal = new Calculator();

        cal.powerOn();
        int result = cal.plus(10,20);
        System.out.println("result: " + result);
        double result2 = cal.divide(10,3);
        System.out.println("result2: " + result2);
        cal.powerOff();

    }
}
