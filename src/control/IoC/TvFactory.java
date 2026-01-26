package control.IoC;

import control.*;

public class TvFactory {
    public static Tv generateTv(String wooferName,String speakerName){
        // wooferName 매개변수에 담겨져있는 문자열이 "marten"이면 MartenWoofer 객체화
        // "genelec" 이면 GenelecWoofer 객체화

//        Woofer woofer = null;
//        if(wooferName.equals("marten")){
//            woofer = new MartenWoofer();
//        }else if(wooferName.equals("genelec")){
//            woofer = new GenelecWoofer();
//        }

        Woofer woofer = switch (wooferName.toLowerCase()){
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
                    default -> null;
        };

        // speakerName 매개변수에 담겨져 있는 문자열이 "jbl"이면 JBLSpeaker 객체화
        // "harman"이면 HarmanSpeaker 객체화

        Speaker speaker = switch (speakerName.toLowerCase()){
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
