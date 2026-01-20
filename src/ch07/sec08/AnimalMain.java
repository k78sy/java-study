package ch07.sec08;
/*
멤버필드는 어차피 private로 은닉화할꺼니 메소드에만 집중

대전제 3가지
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메소드 호출은 타입이 알고 있는 메소드만 호출하 수 있고
    호출이 되면 객체 기준에서 메소드를 찾는다.

    레퍼런스 타입끼리의 형변환은 상속관계에서만 가능
    다형성은 상속관계에서만 나타난다.
* */
public class AnimalMain {
    public static void main(String[] args){
        //1. Animal 객체 주소값 담을 수 있는 animal 변수 + Animal 자식 객체의 주소값도 가능
        Animal animal = new Dog(); // Dog 객체 주소값

        // Dog타입 변수로 BUlldog 객체 주소값 담을 수 잇을까요?
        Dog dog = new Bulldog();
        dog.crying();

        //2. 대전제 2
//        Dog dog 2 = new Animal(); // 컴파일 에러 뜬다.
        //Dog dog2 = (Dog)(New Animal()) // 강제 형변환 해도 안된다. 2번 위반!

       // animal변수레는 Dog 객체 주소값이 담겨져 있기때문에  Dog 타입 변수에 주소값 담을 수 있다.
        Dog dog3 = (Dog)animal; // 객체 주소값만 따지만 맞지만, 부모타입이라 자동형변환 안해줘서 뜨는 오류

        //대전제 3번 내용
        animal.crying();
        //자식들은 crying()을 모두 가진셈
        // 객체를 만든 Dog 클래스에 crying 이 없었다면 animal의 crying 이됐겠지만
        // dog에 있으니 그게 실해

        System.out.println("끝");
    }
}
