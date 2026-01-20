package ch07.sec08;
/* DEEEEEEEEEEEEEEEp
3. 메소드 호출은 타입이 알고 있는 메소드만 호출하 수 있고
    호출이 되면 객체 기준에서 메소드를 찾는다.
* */
public class AnimalMain2 {
    public static void main(String[] args){
        Animal animal = new Bulldog();
        // Dog 객체는 jump() 메소드 가지고 있으나
        animal.crying(); // animal 입장에서 알고 있는 메소드

        //animal.jump(); // animal 입장에서 알고 있는 메소드
        // 부모 타입은 자기가 모르는 자식의 메소드를 불러올 수 없음

        if(animal instanceof Dog) {
            // dog 객체 주소값 가지며, 타입도 dog인 아이를 만들어야함
            Dog animal2 = (Dog) animal;
            animal2.jump();
        }
        /*
        instanceof : 변수에 담겨져 있는 객체를 타입에 담을 수 있으면 true, 없으면 false 리턴
        왼쪽 변수 우측이 타입
        * */
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
    }
}
