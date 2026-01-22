package blackjack;
/*카드 통
Card 객체 주소값 52개를 담을 수 있어야 합니다.
 */
public class CardDeck {
    private Card[] cards = new Card[52];
    private String[] patterns = {"스페이스", "하트", "클로버", "다이아"};
    private String[] denominations = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int drawIdx = 0; // 외부로 카드를 준 idx 관리

    // CardDeck을 기본생성자로 호출만 하여도
    // Card객체 52개를 생성하여 cards가 가리키는 배열에 순차적으로 저장(대입)한다.
    // 가능하면 무늬별로 다른 denomination 값이 저장되었으면 한다.

    public CardDeck(){
        init(); // 내부에서만 사용하는 메소드로 따로 뺌
        shuffle();
//        for(int i=0; i<cards.length; i++){
//            Card c = cards[i];
//            System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
//        }
    }

    public void print(){ // 검증용
        for(int i=0; i<cards.length; i++) {
            Card c = cards[i];
            if (c == null) {
                System.out.printf("null\n");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }

    private void init(){
        int idx = 0;
        for(int k=0; k<patterns.length;k++){
            String pattern = patterns[k];
            for(int i=0; i<denominations.length; i++){
                String denomination = denominations[i];
                Card temp = new Card(pattern, denomination);
                cards[idx++] = temp;
            }
        }
    }
    private void init2(){
        int idx=0; // for문 안 i, d 연산보다는 얘 하나만 돌리는게 낫다.
        for(int i=0; i< patterns.length; i++){ //4
            String pattern = patterns[i];
            for(int d=1; d<=13; d++){ // 4
                String denomination = null;
                switch (d){
                    case 1: denomination = "A"; break;
                    case 11: denomination = "J"; break;
                    case 12: denomination = "Q"; break;
                    case 13: denomination = "K"; break;
                    default: denomination = String.valueOf(d); //정수> 문자열로 바꾸는 메소드
                }
                Card c = new Card(pattern, denomination);
                cards[idx++] = c;
            }
        }
        for(Card c : cards){ // 확인용
            System.out.printf("%s - %s", c.getPattern(), c.getDenomination());
        }
    }
    private void shuffle(){
        //cards 길이(52번) 도는 for문 세팅
        for(int i = 0; i< cards.length;i++ ){
            int randomIdx = (int)(Math.random() * (cards.length));
            //배열 내에서 돌거니까 배열의 길이만큼

            //i방과 randomIdx방의 값을 서로 스와핑한다.
            Card radomVal = cards[randomIdx];
            cards[randomIdx] = cards[i];
            cards[i] = radomVal;

        }
    }

    public Card draw(){
        // cards의 방에 들어있는 card 주소값을 순차적으로 리턴해주며 리턴한 방은 null로 바꾼다.

        if(drawIdx > 51){ return null; }
        Card temp = cards[drawIdx];
        cards[drawIdx++] = null;

//        System.out.printf("뽑은카드: %s - %s\n", temp.getPattern(), temp.getDenomination());
        return temp;
    }
}
