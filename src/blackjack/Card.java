package blackjack;
/*
무늬 pattern(스페이드, 하트, 클로버, 다이아 중 한 값)
숫자 denomination (A, 2~10, J, Q, K 중 한 값을 담을 수 있어야한다)
무늬, 숫자 값 하나씩 저장할 수 잇는 카드 객체를 만들어주세요. 단. 객체 생성 이후 변경은 불가능
* */
public class Card {
    private String pattern;
    private String denomination;
    // setter를 만들지 않는다면 굳이 final 안써도 됨!

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    //getters 생성
    public String getPattern(){
        return pattern;
    }
    public String getDenomination(){ return denomination; }
}
