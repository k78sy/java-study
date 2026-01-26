package control.IoC;

import control.Tv;

public class IoCMain {
    public static void main(String[] args) {
        String wooferName = args[0];
        String speakerName = args[1];

        Tv tv = TvFactory.generateTv(wooferName, speakerName);
        tv.sound();
    }
}
