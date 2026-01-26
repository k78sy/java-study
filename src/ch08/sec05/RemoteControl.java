package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void setVolume(int volume);

    // 인터페이스도 추상클래스처럼 구현부가 있는 메소드 만들 수 있었으면 좋겠다..
    // 디폴트 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("무음해제합니다.");
        }
        defaultStaticCommon(1);
    }

    // 스태틱 메소드(클래스 메소드)는 가질 수 있다.
    static void changeBattery(){
        System.out.println("배터리를 교환합니다.");
    }

    // private 일반 메소드, private static 메소드 가능
    // >> default, static 메소드가 여러개일 때 중복처리를 메소드를 처리하기 위해 존재
    private void defaultCommon(){
        // 디폴트 붙이지 않아도 구현부 작성 가능
        defaultStaticCommon(4);
    }
    private static void defaultStaticCommon(int n1){
        // static은 추상 클래스 못만듬!
        // static은 바로 메모리에 올라가기 때문에, 어디서든 호출 가능!
        // static이 static이 아닌 메소드를 불러내는 건 불가능 (걘 메모리에 바로 올라가지 않으니까)
    }
}
