package ch06.sec09;

public class Truck {
    static String company;
    String model;

    void introduce(){
        System.out.printf("company: %s, model: %s\n", company, model);
    }

    static void run(){
        Truck t = new Truck();
        t.model = "15톤";
        System.out.printf("%s 회사의 %s 모델의 차량이 달린다.", company, t.model);
    }

}
