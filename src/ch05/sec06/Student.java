package ch05.sec06;
/*
객체는 무엇으로 이루어져 있는가?
속성: 멤버 필드, 전역(변수/상수). 값 저장. 객체가 살아있는 동안 값이 유지된다.
메소드: 멤버 메소드 보통 걍 메소드라고 부름

작성순서는 아래 순서로 작성하자
멤버필드
생성자
메소드

기본 생성자는 특별!
생성자 vs 메서드 다른점 2가지
1. 이름은 클래스명과 동일
2. 리턴타입을 작성하면 안됨
* */
public class Student {
    int no;
    String name; // 멤버 필드

    public Student(){ // 기본 생성자 정의
        no = 0;
        name = "홍길동";
        System.out.println("--Student 기본 생성자--");
    }

    void introduceMySelf(){
        System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no, name);
    } // 멤버 메소드. Student가 객체가 된다면 intro~ 일을 할 수 있음
}
// 아파트 설계도를 만드는 중..........