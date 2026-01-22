package blackjack;

import java.util.Arrays;

public class BlackJackMainBackUp {
    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        System.out.println("------------------");
        gamer.receiveCard(cd.draw());
        System.out.println("------------------");
        gamer.receiveCard(cd.draw());
        System.out.println("------------------");

        System.out.println("------------------");
        dealer.receiveCard(cd.draw());
        System.out.println("------------------");
        dealer.receiveCard(cd.draw());
        System.out.println("------------------");

        Card[] gamerCards = gamer.openCard();
        System.out.println("게이머 받은 카드들 : " + Arrays.toString(gamerCards)); // 검증용
        System.out.println("게이머 점수: " + Rule.calcScore(gamerCards));
        Card[] dealerCards = dealer.openCard();
        System.out.println("딜러 받은 카드들 : " + Arrays.toString(dealerCards)); // 검증용
        System.out.println("딜러 점수: " + Rule.calcScore(dealerCards));
        dealer.needMoreCard();

        // 카드 받는게 종료
        Rule.whoIsWinner(dealer,gamer);

    }
}
