package ch04.sec02;

public class IfElseifElseExample {
    public static void main(String[] args){
        int score = (int)((Math.random()* 81.0) + 20); //20~100사이 랜덤값

        System.out.println("score: " + score);

        /*
        90~100점 "A등급"
        80~89점 "B등급"
        70~79점 "C등급"
        나머지 "D등급"
        * */

        String result = "D";

        if(score >= 90){
            result = "A";
        }else if(score >= 80){
            result = "B";
        }else if(score >= 70){
            result = "C";
        }

        System.out.println("시험결과: " + result);
        System.out.printf("\n시험점수:%d점\n시험결과:%s등급", score, result);
    }
}
