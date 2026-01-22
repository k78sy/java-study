package ch08.sec02;

public interface RemoteControl {
    // 필드 선언 앞에 public static final이 항상 들어간다.
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 10;

    // 메소드 선언 앞에 public abstract가 항상 들어간다.
    void turnOn();
    void volumeUp();
    void volumeDown();
    void mute(); //음소거


}
