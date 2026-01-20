package ch06.sec14;

public class CarMain {
    public static void main(String[] args){
        Car c1 = new Car("그랜저", 170);
        //c1.model = "그랜저"; // 외부에서는 접근 금지
//        System.out.printf("모델명: %s, 속도: %d", c1.model, c1.speed); // 외부에서 접근 안됨!
        c1.setModel("소나타");

        String model = c1.getModel();
        int speed = c1.getSpeed();
        System.out.printf("model:%s, speed:%d\n", model, speed);
    }
}
