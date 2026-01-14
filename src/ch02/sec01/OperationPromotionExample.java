package ch02.sec01;
// p.64
public class OperationPromotionExample {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 3;
        int result = n1 / n2; // 실수가 아닌 값만 저장될 수 있음.
        System.out.println("result: " + result);

        double n3 = 10;
        double n4 = 3;
        double result2 = n3 / n4;
        System.out.println("result2: " + result2);

        double result3 = (double)n1 / n2; // n1을 강제형변환 된 상태에서 원래는 계산 안되야하나 n2가 자동형변환되어 연산이 됨
        System.out.println("result3: " + result3);


        /// ///////////////////////////////////////////////////////////////////////////

        char c1 = 'A';
        System.out.printf("%c - %d\n", c1, (int)c1); // 대문자 A는 65정수로 저장된다

        int i1 = c1 + 2; // 원래 연산 안되는 거여야하는지만 계산하기 위해서 c1이 65로 자동 형변환 됨. 결과 67
        System.out.printf("%c - %d\n", (char)i1, i1); // char로 형변환이 먼저 되고 그게 %c에 들어감

        // 소문자로 시작하는 타입 8개(int, double...) : 리터럴 타입
        // 대문자로 시작하는 건 그 외 클래스(String... System도?) : 레퍼런스 타입 (주소값이 저장됨)
        // 뭔소린지??????????????????
        // 스트링 객체의 주소값이 저장됨. 스트링 객체가 AC

        String str = "AC"; // 문자"열" 배열. 0:65, 1ㅣ67
        System.out.println("str: "+ str);
    }
}
