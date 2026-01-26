package ch11.sec02;

public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        printLength("ThisIsJava");
        printLength(null);
    }
    public static void printLength(String data){
        int result = data.length();
        System.out.println("문자 수 : " + result);

    }
}
