package ch07.sec02;
// 상속 + 생성자 마무리
// Phone클래스를 상속받고 싶다면 extends 키워드 사용
// 스마트폰이 객체화 되면 폰도 객체화되며 자식으로부터 부모쪽으로 연결된다.

// SmartPhone이 Phone을 가리킨다.
public class SmartPhone extends Phone {
    private boolean wifi; // 전역변수 boolean 타입 디폴트값: false

    public SmartPhone(String model, String color){
        //super();// 부모의 생성자 호출
        // 부모가 기본 생성자가 없어서 에러 발생
        // 기본 생성자를 만들거나, 있는 생성자 사용하면 됨.
        super(model, color);
    }

    public void toggleWifi(){
        // 값을 바꾼다.
        wifi = !wifi;
        System.out.println("wifi: "+ wifi);
    }

    // 메소드 오버라이딩
    @Override
    public void bell(){
        super.bell(); // 부모것도 불러 올 수 있음
        System.out.println("스마트폰 진동과 벨이 울린다.");
    }
}
