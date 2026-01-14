package ch04.sec02;

public class IfElseifElseExample2 {
    public static void main(String[] args){
        int score = (int)((Math.random()* 81.0) + 20); //20~100사이 랜덤값

        System.out.println("score: " + score);

        /*
        90~100점 "A등급"
        80~89점 "B등급"
        70~79점 "C등급"
        나머지 "D등급"
        * */

        char result = 'A';
        if(score < 70){
            result = 'D';
        }else if(score < 80){
            result = 'C';
        }else if(score < 90){
            result = 'B';
        }
        System.out.printf("점수:%d / 등급:%c등급", score, result);
    }
}
