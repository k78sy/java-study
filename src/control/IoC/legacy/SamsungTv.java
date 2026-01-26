package control.IoC.legacy;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv(){
//        speaker = new HarmanSpeaker();
        speaker = new JBLSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv의 소리는요");
        speaker.speakerSound();
    }
}
