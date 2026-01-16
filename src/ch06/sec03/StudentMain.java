package ch06.sec03;

//p.214
public class StudentMain { // main메소드를 가지기 위한 클래스를 만들었음
    public static void main(String[] args){
        //Student 객체 생성(객체화)
        Student s1 = new Student();//지역변수 // 자바는 무조건 new 키워드를 써야함
        // 만들어둔 클래스를 이용해 객체(instance)를 new새롭게 만들어 그 주소값을 s1에 저장했음

        // Student s1은 레퍼런스 변수이고, 객체의 주소값을 담을 수 있다.
        // 단!! Student 객체의 주소값만 담을 수 있다.
//        Student s0 = new String(""); //< 이런 거 안됨. Student 객체 주소값만 담을 수 있다.
//        String st0 = new Student(); // String객체 주소값만 담을 수 있음.

        // Student() >> 기본 생성자(default constructor);
        // 기본생성자는 메서드의 한종류인데 특별한 메소드다.
        // 객체 생성때만 호출할 수 있고, 생성 이후에는 호출할 수 없는 메소드
        // 객체 생성할 때는 무조건 생성자를 호출해야합니다.
        // 생성자를 정의하지 않으면 컴파일러가 기본 생성자는 자동으로 만들어 준다.
        // 아무 파라미터를 안받는 거: 기본 생성자

        // 변수는 크게 두 타입. 프라머티브 타입(8개밖에 없으니까), 레퍼러스 타입 중 레퍼런스 타입
        // 소문자로 시작하지 않는건 레퍼런스 타입
        s1.introduceMySelf();

        s1.no = 1;
        s1.name = "권수영";
        s1.introduceMySelf();

        Student s2 = new Student();
        s2.no = 12;
        s2.name = "임준이";
        s2.introduceMySelf();

        Student s3 = new Student(100, "이름");
        s3.introduceMySelf();

        Student s4 = s1;
        s4.introduceMySelf();
    }
}
