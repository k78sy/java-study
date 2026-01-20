package ch07.sec02;

public class SmartPhoneMain {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone("갤럭시", "은색");
        sp.toggleWifi();//true
        sp.toggleWifi();//false
        sp.toggleWifi();//true
        sp.toggleWifi();//true

        //부모가 가지고 있는 메소드를 호출할 수 있다.
        sp.bell();
        sp.hangUp();
        sp.sendMessage("하이!");

    }
}
