package ch02.sec01;

public class UsingPrintf {
    public static void main(String[] args){
        String name = "홍길동";
        int age = 22;
        double height = 176.51;
        char bloodType = 'A';
        boolean isMan = true;

        // printfS는요 JS의 `${변수명}` 이러한 기능을 쓰는 것. 즉, 문자열 사이에 변수의 값을 삽입하는 방법.

        // println과 위 변수들을 이용하여 문장을 완성하시오.
        //문장: 홍길동의 나이는 22세이며, 키느 176.5cm이고, 혈액형은 A형이고, 성별은 남자인가? true

        System.out.println(name + "의 나이는 " + age + "세이며, 키는 " + height + "cm이고, 혈액형은 " + bloodType +"형이고, 성별은 남자인가? " + isMan);
        System.out.printf("%s의 나이는 %d세이며, 키는 %.1fcm이고, 혈액형은 %c형이고 성별은 남자인가? %b\n", name, age, height, bloodType, isMan);

        System.out.printf("가격: %d\n", 1_000_000);
        System.out.printf("가격: %,d\n", 1000000);

        String result = String.format("가격: %,d\n", 1_000_000);
        System.out.println(result);

        /// ///////////////////////////////////////////////////////////

        int mon = 10;
        int day = 5;

        // 월, 일을 합쳐서 항상 4자리로 만들고 싶을 때, 00-00 이렇게
        System.out.printf("%d-%d\n", mon, day); // 걍 적힌 값 그대로 나옴
        System.out.printf("%2d-%2d\n", mon, day); // 무조건 두자리를 차지하겠다
        System.out.printf("%02d-%02d\n", mon, day); // 두자리 중에 빈자리가 있으면 0을 쓰겠다
    }
}
