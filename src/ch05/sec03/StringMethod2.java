package ch05.sec03;

public class StringMethod2 {
    public static void main(String[] args){
        // 문자열 자르기 substring 메소드 이용 방법 두가지가 있음
        // 첫번째: 아규먼트 1개(정수) 이용. 정수(index) 문자부터 마지막 방번호까지 문자열을 잘라낸다.
        String oldStr1 = "abcdefghijklmnopqrstu";
        String newStr1 = oldStr1.substring(10); // 정수가 들어가야함. 방번호
        System.out.println("oldStr1: "+ oldStr1);
        System.out.println("newStr1: "+ newStr1);

        // 두번째, 아규먼트 2개 (둘다 정수)
        // 둘다 index값. (시작index, 종료index 그 전 문자까지)
        // 10,11,12 담고 싶으면 10, 13
        String newStr2 = oldStr1.substring(10,13);
        System.out.println("newStr2: "+ newStr2);

        //간단 미션, 생년월일 문자열만 잘라내기 해주세요.
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0,6);
        System.out.println("생년월일: " + firstNum);

        String secondNum = ssn.substring(7);
        System.out.println("secondNum: " + secondNum);

        // 문자열 안에서 문자열 찾기. -1이 나오면 그런 문자열 없다는 의미
        // 찾으면 첫번째 문자의 index값을 리턴한다.
        int idx = oldStr1.indexOf("hi"); // htk 이런 없는 거 찾으면 : -1 찍힘
        System.out.println("idx: " + idx); // 7

        int idx2 = ssn.indexOf("5"); //5
        System.out.println("idx2: " + idx2);

        int idx3 = ssn.lastIndexOf("5"); // 11
        System.out.println("idx3: " + idx3);

        if(ssn.contains("88")){
            System.out.println("ssn에 88이 있음!");
        }else{
            System.out.println("ssn에 88이 없음!");
        }

        String board ="번호,제목,내용,성명"; // ,기준으로 값을 쪼개서 배열 만들기
        String[] arr = board.split(","); // 스트링배열 리턴 스트링배열객체의 주소값이 있음.
        for(int i=0; i<arr.length; i++){
            System.out.printf("arr[%d]: %s\n", i, arr[i]);
        }
    }
}
