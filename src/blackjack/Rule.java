package blackjack;
//2~10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1로 계산
// 카드들의 모든 점수를 더하고 더한 점수를 리턴하시오
public class Rule{
    public static int calcScore(Card[] cards){
        int score = 0;

//        for(int i=0; i<cards.length; i++){
//            String num = cards[i].getDenomination();
//
//            if(num == "A"){
//                score += 1;
//            }else if(num == "J" || "Q" || "K"){
//                score += 10;
//            }else {
//                score += Integer.parseInt(num);
//            }
//        }
//        return score;

        for(Card card : cards){
            String denomination = card.getDenomination();
            int d = switch (denomination){
                case "A" -> 1;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            score += d;
        }
        return score;
    }

    public static void whoIsWinner(Dealer dealer, Gamer gamer){
        int dealerScore = calcScore(dealer.openCard());
        int gamerScore = calcScore(gamer.openCard());
//        int dealerScore = 20;
//        int gamerScore = 20;
        /*
        둘의 점수가 같다 > 무승부
        둘다 21점 초과 > 무승부
        딜러가 21점 초과, 게이머 21점 이하 > 게이머 승
        게이머가 21초과, 딜러가 21점 이하 > 딜러 승
        둘다 21점 초과 X, 게이머가 딜러가 점수 높다 > 게이머
        * */
        int BLACK_JACK = 21;
        System.out.printf("딜러점수:%d / 게이머점수:%d\n", dealerScore,gamerScore);

        if(dealerScore == gamerScore || (dealerScore > BLACK_JACK && gamerScore > BLACK_JACK)){
            System.out.println("무승부");
        } else if(gamerScore <= BLACK_JACK && (dealerScore > BLACK_JACK || gamerScore > dealerScore)){
            System.out.println("게이머승");
        } else{
            System.out.println("딜러 승");
        }

//        if(dealerScore == gamerScore){
//            System.out.println("무승부");
//        }else if(dealerScore > BLACK_JACK ){
//            if(gamerScore > BLACK_JACK) {
//                System.out.println("무승부");
//            }
//            System.out.println("게이머 승리");
//        }else if(gamerScore > BLACK_JACK){
//            if(dealerScore > BLACK_JACK){
//                System.out.println("무승부");
//            }
//            System.out.println("딜러 승리");
//        }else if(gamerScore>dealerScore){
//            System.out.println("게이머 승리");
//        }else{
//            System.out.println("딜러 승리");
//        }

    }
}
