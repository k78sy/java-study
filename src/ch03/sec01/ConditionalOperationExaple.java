package ch03.sec01;

public class ConditionalOperationExaple {
    public static void main(String[] args){
        // 10~100점 사이의 랜덤값
        int score = (int)(Math.random() * 91.0 + 10 );
        System.out.println("score: " + score);

        // 삼항식을 이용. 90점 초과는 "A" 출력 / 90점 이하인 애들 중에서 80점 초과는 B 출력. 나머지는 C 출력
        String result = (score > 90 ? "A"
                         : score > 80 ? "B" : "C");
        System.out.println("result: " + result);
    }
}
