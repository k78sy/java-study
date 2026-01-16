package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args){
        //PracticeMethod
        PracticeMethod pm = new PracticeMethod();

        pm.abs(10);
        pm.abs(-10);
        pm.abs(-8);

        int r1 = pm.random(10); //0~9랜덤값 리턴
        int r2 = pm.random(20); //0~20랜덤값 리턴
        System.out.println("r1: " + r1 + ", r2: " + r2);

        int r3 = pm.random(2,10); //2~9 랜덤값 리턴
        int r4 = pm.random(10,15); //10~14 랜덤값 리턴
        System.out.println("r3: " + r3 + ", r4: " + r4);
    }
}
