package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd2 {
    public static void main(String[] args){
        // 논리! 배열의 크기는 한번 정해지면 수정할 수 없다.
        int[] arr = {2, 4, 8, 10, 12, 13};
        //

        int value = 22;
        int idx = 2;
        // [2, 4, 22, 8, 10, 11]

        int[] arr2 = new int[arr.length + 1];

        for(int i=0; i<arr2.length; i++){
            if(i == idx){
                arr2[i] = value;
            }else if(i < idx){
                arr2[i] = arr[i];
            }else {
                arr2[i] = arr[i - 1];
            }
        }
        // 2(0), 4(1), 8(2), 10(3), 12(4), 13(5)
        // 2, 4, 22, 8(3-1), 10(4-1), 12(5-1), 13(6-1)


        arr2[idx] = value;
        // 방법1
        for(int i=0; i<idx; i++){
            arr2[i] = arr[i];
        }
        for(int i=idx; i<arr.length; i++){
            arr2[i+1] = arr[i];
        }

        // 방법2
        for(int i=0; i<arr.length; i++){
            arr2[i < idx ? i : i + 1] = arr[i];
        }


        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
