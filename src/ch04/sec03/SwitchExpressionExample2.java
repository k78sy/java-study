package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String grade = "VIP"; // VIP, GOLD, NORMAL
        /*
        VIP는 가격에 10% 할인된 가격
        GOLD는 가격에 5% 할인된 가격
        NORMAL은 할인 없는 가격
        */
        int price = 10_000; // 제품 가격

        int buyPrice = switch (grade){
            case "VIP" -> (int)(price - price * 0.1);
            case "GOLD" -> (int)(price - price * 0.05);
            default -> price;
        };

        System.out.println("buyPrice: "+ buyPrice);
    }
}
