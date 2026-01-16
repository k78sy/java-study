package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args){

        final int COUNT = args.length == 1? Integer.parseInt(args[0]) : 3; // 자바에서 상수 만드는 방법 (final 붙이기/ 보통 대문자로 씀)
        // 어떤 숫자가 특별한 역할을 한다면 매직넘버로 부르며 보통 상수/변수로 관리한다.

        System.out.printf("-----숫자 야구 게임(%d)------\n", COUNT);
        Scanner scanner = new Scanner(System.in);

        // 맞춰야되는 숫자들
        int[] questions = new int[COUNT];

        // questions에 중복되지 않는 숫자(1~9)를 배열의 길이만큼 채워야 한다.
        for(int i=0; i<questions.length; i++){
            questions[i] = (int)((Math.random() * 9.0)+1);
            for(int k=0; k<i;k++){ // 중복이 있는지 모든 방을 확인. 중복 찾는 즉시 break
                if(questions[i] == questions[k]){
                    i--;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(questions));
        int tryCount = 0;
        while (true) {
            tryCount++;
            // 숫자 3개를 입력받는다.
            System.out.print("ANSWER >> ");
            String answer = scanner.nextLine();
//            System.out.println(answer);

            //answer 문자열을 이용하여 "" 기준으로 값들을 쪼개서 배열로 만들고 싶다.
            String[] strAnswers = answer.split(" "); //nextLine 스트링으로 받아왔으니 string 배열
            int[] answers = new int[strAnswers.length]; // 빈 int배열 생성
            for (int i = 0; i < strAnswers.length; i++) {
                answers[i] = Integer.parseInt(strAnswers[i]); // string배열의 값을 int로 형 변환 후 새 배열의 값 찾음
            }
//            System.out.println(Arrays.toString(answers));

            int strike = 0;
            for (int i = 0; i < questions.length; i++) {
                if (questions[i] == answers[i]) {
                    strike++;
                }
            }
            System.out.printf("%d스트라이크 ", strike);
            int ball = 0;
            for (int i = 0; i < questions.length; i++) {
                for (int k = 0; k < answers.length; k++) {
                    if (answers[i] == questions[k]) {
                        ball++;
                    }
                }
            }
            System.out.printf("%d볼", ball);

            int s = 0, b = 0;
            for (int i = 0; i < questions.length; i++) {
                for (int k = 0; k < answers.length; k++) {
                    if (questions[i] == answers[k]) {
                        if (i == k) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            System.out.printf("\nS:%d, B:%d, O:%d\n", s, b, (COUNT - (s + b)));
            // while문 빠져나가야하는 조건
            if(s == COUNT){ break; }
        }
        System.out.printf("--정답!-- %d번 만에 맞추셨어요", tryCount);
    }
}
