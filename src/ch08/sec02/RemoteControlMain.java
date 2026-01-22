package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();

        // remoteControl에 정의되지 않은 메소드는
        // 자식 TvRemoteControl에 정의했더라도 불러올 수 없음
        TvRemoteControl trc = (TvRemoteControl)rc;
        trc.turnOff();
        // turnOff 메소드를 가지고 있는 클래스 타입으로 강제 형변환 하면 메소드 사용 가능

        for(int i=0; i<20;i++){
            rc.volumeUp();
        }
        for(int i=0; i<15;i++){
            rc.volumeDown();
        }
    }
}
