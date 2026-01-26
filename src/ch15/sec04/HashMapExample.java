package ch15.sec04;

//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // 제네릭 첫번째 타입: Key 타입
        // 제네릭 두번쨰 타입: Value 타입
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        System.out.println("value0-0: "+map.get("홍길동")); // 90
        map.put("홍길동",95);
        System.out.println("value0-1: "+map.get("홍길동")); // 95

        int value1 = map.get("홍길동");
        System.out.println("value1: " + value1);
        System.out.println("value2: " + map.get("동장군"));
        System.out.println("value3: " + map.get("ㅋㅋㅋ"));

        System.out.println("size: "+ map.size());


        // Set은 Value만 저장하고 중복값 저장이 X
        Set<String> keySet = map.keySet(); // key값들만 빼내서 Set으로 만든것(동장군, 신용권, 홍길동)
        //Set 객체를 이용하여 Iterator 반복자를 생성(반복하기 위해서)
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){ // hasNext() 다음을 가리켰을 때 => 데이터 있으면 true 없으면 false
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n", k, v);
        }
    }
}
