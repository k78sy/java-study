package ch02.sec01;

public class OverValue {
    public static void main(String[] args){
        byte b1 = -128;
        System.out.println("b1: " + b1);
        // byte b2 = -129; int로 바꾸던지 해라라고 뜸
        byte b3 = 127;
        System.out.println("b3: " + b3);
        // byte b4 = 128; 안된다! 그릇이 1L짜리인데 1.1L물을 넣으려고 한거임

        // int: 4byte=32bit, long 8byte=64bit
        // 정수 리터럴은 기본적으로 int타입. l, L을 붙여서 long 타입으로 변경한다.
        long l1 = 1_000_000_000_000_000_000L;
        System.out.println("l1: " + l1);
        // long l2 = 9_300_000_000_000_000_000L; 안됨!!!
        // 제일 끝에 L을 빼면 리터럴이 인트타입이라 오류남
        long l3 = 2_147_483_647; // int가 저장할 수 있는 값은 L을 안붙여도 되는 듯

        // double 8byte, float 4byte
        double d1 = 10.1; //기본적으로 실수 리터럴은 double타입. D를 붙여도 되고 안붙여도 된다.

        //문제는 플롯이에요.
        //float f1 = 10.1; 더 큰 쪽에서 작은 쪽ㅇ로 데이터를 옮길 때는 자동형변환 해주지 않는다.
        float f2 = 10.1f; // 리터덜에 f, F를 붙이면 float타입의 리터럴이 된다.
        double d2 = f2; // 자동형변환이 된다. float > double 타입으로 변경. 작은쪽에서 큰쪽으로는 자동형변환 가능

        long l2 = 1_000_000_000_000_000_000L;
        float f3 = l2; // ??????? 이게 왜 되는거임.???? 왜냐하면 연산을 해서 넣을 수 있기에 들어가는 거임. 다만 정확한 값이 아님.
        //정확도가 떨어지는 대신 큰 값을 넣을 수 있는 것인 셈.
        // double가 float보다 더 정확한 편
        // float은 지수 계산으로 저장하기 떄문에 아주 큰 값도 저장가능하다. 다만 정확도는 떨어짐.

        // 페이지 55쪽
        // 자동 형변환 허용범위 순
        // byte < short, char, int < int < long < float < double
        // 좌측에서 우측으로는 자동형변환 됨
        // 우측에서 좌측으로는 자동 형변환 안됨

        long l4 = 10L;
        int i1 = (int) l4; // 강제형변환 int 10이 저장됨
        System.out.println("l4: " + l4);
        System.out.println("i4: " + i1);

        //byte -128 ~ 127 범위의 값을 저장할 수 있다.
        int i2 = 128;
        byte b4 = (byte) i2; // 오버플로우 현상.
        System.out.println("b4: " + b4);

        int i3 = -129;
        byte b5 = (byte)i3; //언더 플로우
        System.out.println("b5: " + b5);
    }
}
