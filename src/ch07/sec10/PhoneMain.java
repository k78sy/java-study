package ch07.sec10;

public class PhoneMain {
    public static void main(String[] args){
//        Phone p = new Phone(); // Phone 클래스에 abstract 키워드 쓰면 객체화 안됨
        Phone p = new SmartPhone();
        p.bell();
    }
}
