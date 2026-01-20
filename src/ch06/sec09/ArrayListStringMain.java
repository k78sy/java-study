package ch06.sec09;

import java.util.Arrays;

public class ArrayListStringMain {
    public static void main(String[] args){
        ArrayListString list = new ArrayListString();

        System.out.println(Arrays.toString(list.arr));
        list.add("하하");
        System.out.println(Arrays.toString(list.arr));
        list.add("히히");
        System.out.println(Arrays.toString(list.arr));
        list.add("호호");
        System.out.println(Arrays.toString(list.arr));
        list.add("허허");
        System.out.println(Arrays.toString(list.arr));

        System.out.println("-----------------------");
        String val = list.get(1);
        System.out.println("val: " + val);

        System.out.println("-----------------------");
        String remoVal = list.remove();
        System.out.println("remoVal: " + remoVal);
        System.out.println(Arrays.toString(list.arr));

        System.out.println("-----------------------");
        list.add(1,"나야");
        list.add(1,"ㅋㅋ");
        list.add(1,"ㅎㅎ");
        list.add(1,"ggg");
        System.out.println(Arrays.toString(list.arr));
        System.out.println("-----------------------");
        String removeVal2 = list.remove(2);
        System.out.println(" removeVal2: " +  removeVal2);
        System.out.println(Arrays.toString(list.arr));

        System.out.println("-----------------------");
        String removeVal3 = list.get(1);
        System.out.println("removeVal3: " + removeVal3);
        list.remove(removeVal3);
        System.out.println(Arrays.toString(list.arr));
    }
}
