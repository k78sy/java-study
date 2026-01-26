package control.IoC;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv의 소리는요");
        speaker.speakerSound();
    }
}
