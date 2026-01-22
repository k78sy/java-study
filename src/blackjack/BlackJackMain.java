package blackjack;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        //딜러와 게이머는 순차적으로 카드를 하나씩 뽑아
        // 각자 2개의 카드를 소지한다.

        for(int i=0; i<2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        // 딜러가 가지고 있는 카드의 점수가 16점 이하면
        // 카드 한장을 더 소지하게 한다.
        if(dealer.needMoreCard()){
            dealer.receiveCard(cd.draw());
        }

//        for(int i=0; i<gamer.openCard().length;i++){
//            Card c = gamer.openCard()[i];
//        }

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            // 무한 반복문
//            System.out.print("카드를 더 뽑으시겠습니까? y/n: ");
//            String moreCard = scanner.nextLine();
//
//            if (moreCard.equals("n")) {
//                break;
//            } else if (moreCard.equals("y")) {
//                gamer.receiveCard(cd.draw());
//                gamer.showYourCards();
//                System.out.println("현재 점수: " + Rule.calcScore(gamer.openCard()));
//            }
//        }

        dealer.showOneCards();

        while(true){
            //게이머에게 카드를 더 받을 지 물어본다.
            gamer.showYourCards();
            System.out.print("카드를 더 받으시겠습니까? (y/n): ");
            String answer = scanner.next();
            if("n".equalsIgnoreCase(answer)){ //equalsIgnoreCase() 대소문자 무시
                break;
            }else if(!"y".equalsIgnoreCase(answer)){
                continue;
            }
            gamer.receiveCard(cd.draw());
            if(Rule.calcScore(gamer.openCard()) > 21){
                break;
            }
        }

        dealer.showYourCards();

        Rule.whoIsWinner(dealer, gamer);
    }
}
