package ch06.sec08;

public class Calculator {
    public void powerOn(){
        System.out.println("전원 ON");
    }
    public void powerOff(){
        System.out.println("전원 OFF");
    }
    public int plus(int x, int y){
        return x + y;
    } //return 받고 싶은 데이터 타입을 앞에써주면 됨
    public double divide(int n1, int n2){
//        return (double)n1 / (double)n2;
        return (double)n1/n2;
    }
}
