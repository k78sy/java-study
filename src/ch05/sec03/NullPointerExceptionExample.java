package ch05.sec03;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        int[] arr = null; //null은 주소값 없다는 의미
        // int len = arr.length; // NPE.NullPointerException 발생 가리키는 객체가 없는데 속성값 읽기 혹은 메소드 호출하면 예외 발생

        String input = null;
//        if("3".equals(input)){
        if(input.equals("3")){
            System.out.println("정지");
        }
        System.out.println("끝!");
    }
}
