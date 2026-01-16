package ch05.sec03;

public class Mission01 {
    public static void main(String[] args){
        String fileNm = "abchfhfhfsdf12-jjk-bbb.kkk.jpeg";

        //유연하게 코드 짜야함............................
        int idx = fileNm.lastIndexOf(".");
        //System.out.println("idx: " + idx);
        String file = fileNm.substring(idx + 1);
        System.out.println(file);


    }
}
