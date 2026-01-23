package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

//ch06.sec09.ArrayListString
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("하하");
        list.add("후후");
        list.add("크크");
        String st1 = list.get(0);
        System.out.print(list.size() - 1);
        System.out.print(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        int int1 = list2.get(0);
        System.out.print(list2);
    }
}
