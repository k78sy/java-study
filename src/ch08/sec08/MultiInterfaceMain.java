package ch08.sec08;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
//        rc.search(""); // 리모트컨트롤 타입이기 때문에 서치어블 메소드 사용 못함

        // 두개를 함께 사용하고 싶다면 두개의 인터페이스를 가진 스마트 텔레비전

        SmartTelevision st = (SmartTelevision) rc;
        st.turnOn();
        st.turnOff();
        st.search("www.naver.com");


        // 인터페이스 다중 상속 가능한 이유: 인터페이스의 함수는 내용이 없어서 중복되도 자식에서 선언하면 되기때문에
        // 클래스 이름이 없는 구현 클래스를 만들고 바로 객체화 한다.
        // 일회용. 매번 내용이 달라져야할 떄 사용
        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };
    }
}
