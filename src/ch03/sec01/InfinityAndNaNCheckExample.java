package ch03.sec01;
//p.89
public class InfinityAndNaNCheckExample {
    public static void main(String[] args){
        int x = 5;
        int y = 0;
        double y2 = 0; // 0.0

        System.out.println(x/y);
        // 문법의 오류: 컴파일 오류
        // 실행하다가 오류가 났음요!!!! 절대로 0으로 나누지 말라고 뜸

        //System.out.println(x/y2); // 이러면 Infinity가 나옴

//        System.out.println(x % y); // 에러 발생
//        System.out.println(x % y2); // Not a Number

//        double result = x / y2;
//        double result = x % y2;

//        if(Double.isInfinite(result)){
//            System.out.println("연산불가. Infinity");
//        }else if(Double.isNaN(result)){
//            System.out.println("연산불가. NaN");
//        }else {
//            System.out.println("result: "+ result);
//        }

//        if(Double.isInfinite(result) || Double.isNaN(result)){
//            System.out.println("연산불가");
//        }else {
//            System.out.println("result: "+ result);
//        }
    }
}
