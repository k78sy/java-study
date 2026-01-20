package ch07.sec08;
/*
멤버필드는 어차피 private로 은닉화할꺼니 메소드에만 집중

대전제 3가지
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메소드 호출은 타입이 알고 있는 메소드만 호출하 수 있고
    호출이 되면 객체 기준에서 메소드를 찾는다.
* */
public class Animal {
    public void crying(){
        System.out.println("동물이 운다.");
    }


}
