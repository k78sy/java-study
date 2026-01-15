package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args){
        // 자바에서 배열 만드는 방법 중 하나
        // 자바에서도 배열은 객체이긴 함. 자바스크립트랑 느낌 다름
        // 진리! primitive 변수(int a;)를 제외한 모든 것들은 참조 변수 (뭔소린가요?)
        // primitive (정수 실수등 8가지)
        int a; //primitive 타입 일반 변수. 그 외는 모두 참조변수

        // 이하 모두 Reference 타입. 둘을 구분하는게 굉장히 중요하다.
        // 변수의 목적: (바뀌기도 하는)값을 담기 위해...........
        // 값의 성질이 다름! primitive 변수: 값 = 리터럴 // 속도가 빠름
        // Reference 변수의 값: 주소값
        int b[];
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = arr1;

        // 레퍼런스 타입끼리의 == 비교는 주소값 비교
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));
        System.out.println("arr1 == arr3 :  "+ (arr1 == arr3));
    }
}
