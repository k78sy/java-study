package blackjack;

public class Gamer {
    // 게이머는 카드 객체 주소값 52개를 저장할 수 있다.
    protected Card[] gamerCards = new Card[52];
    private int receiveIdx = 0;

    public void receiveCard(Card card){
        gamerCards[receiveIdx++] = card; // 실행이 된 다음에 숫자++
        System.out.printf("받은카드: %s - %s\n", card.getPattern(), card.getDenomination());
    }

    public Card[] openCard(){
        // null이 없는 새로운 Card 배열을 만들어서 리턴

        Card[] temp = new Card[receiveIdx];
        for(int i=0; i<temp.length; i++){
            temp[i] = gamerCards[i];
        }
        return temp;
    }
}
