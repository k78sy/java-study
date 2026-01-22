package ch08.sec02;

public class TvRemoteControl implements RemoteControl{
    private int volume = MIN_VOLUME;
    private int memoryVol;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("TV를 켠다");
    }

    public void turnOff() {
        System.out.println("TV를 끄다");
    }


    @Override
    public void volumeUp() {
        if(volume < MAX_VOLUME){
            ++volume;
        }
        displayVolume();
    }

    @Override
    public void volumeDown() {
        if(volume > MIN_VOLUME){
            --volume;
        }
        displayVolume();
    }

    // 중복되는 건 메소드로 빼주는 게 좋다~~
    private void displayVolume(){
        System.out.printf("volume: %d\n", volume);
    }

//    @Override
//    public void mute(){
//        mute=!mute;
//        int muteVol = MIN_VOLUME;
//        if(!mute){
//            System.out.print("볼륨 복귀");
//            volume = muteVol;
//            muteVol = volume;
//        }else{
//            System.out.print("뮤트상태입니다");
//            volume = muteVol;
//        }
//        displayVolume();
//    }

    @Override
    public void mute() {
        mute = !mute;
        if(mute){
            memoryVol = volume;
            volume = MIN_VOLUME;
            System.out.print("(음소거) ");
        }else{
            volume = memoryVol;
        }
        displayVolume();
    }
}
