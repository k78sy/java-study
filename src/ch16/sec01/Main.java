package ch16.sec01;

public class Main {
    public static void main(String[] args) {
        //인터페이스 사용 방법
        // 1. (이름이 있는) 클래스로 구현 한다. like CalcSum 클래스
        Calculable c1 = new CalcSum();
        c1.calculate(10,20);

        //2. 익명 클래스로 구현 한다.
        Calculable c2 = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x * y);
            }
        };
        c2.calculate(10, 20);

        // 3. 람다식을 이용한다. (일회용) 익명 클래스를 짧게 쓰는 것!
        Calculable c3 = (x, y) -> System.out.println(x*y);
        c3.calculate(10,20);
    }
}
