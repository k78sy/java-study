package ch11.sec02;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        printLength("ThisIsJava");
        System.out.println("-----------------");
        printLength(null);

        System.out.println("-----------------");
        System.out.println("끝!!!");
    }
    public static void printLength(String data){
        try {
            System.out.println("시작!!!");
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }catch(Exception e){
            System.out.println("예외발생!!!");
            e.printStackTrace(); //
        }finally { // 무조건 실행
            System.out.println("Finally!!!!!");
        }
    }
}
