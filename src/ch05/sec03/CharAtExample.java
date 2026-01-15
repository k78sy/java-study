package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args){
        //문자열은 배열임!! 각방읜 char
        String ssn = "950624-1230123";

        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);
        String gender2 = gender == '1' || gender == '3'? "남자" : "여자";
        System.out.println("성별: " + gender2);

        switch(gender){
            case '2': case '4':
                System.out.println("여자");
                break;
            case '1': case '3':
                System.out.println("남자");
                break;
            default:
                System.out.println("다시 확인해주세요");
        }

        int len = ssn.length(); //
        System.out.println("len: " + len);
    }
}
