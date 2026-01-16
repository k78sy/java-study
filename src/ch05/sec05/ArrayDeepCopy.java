package ch05.sec05;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args){
        int[] arr = {10, 8, 88, 1, 100, 14, 200};
        int[] arr2 = arr; // 얕은 복사. 주소값을 그대로 전해준거

        arr2[1] = 77; // 그래서 복사한 배열의 값을 바꿔도 원본도 바뀐다

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("arr == arr2: " + (arr == arr2));

        System.out.println("------------------");
        // arr과 똑같은 값을 가지고 있는 새로운 배열을 만들거에요.
        // 1. 첫번째 해야할 일! 똑같은 크기의 배열을 만들어야함

        int[] arr3 = new int[arr.length];
        System.out.println(Arrays.toString(arr3));
        System.out.println("arr == arr3: " + (arr == arr3)); // 주소값 같니? false!

        // 2. 값 넣기
        for(int i=0; i<arr.length; i++){
            arr3[i] = arr[i];
        } // 딥카피

        arr3[1] = 99;

        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr: " + Arrays.toString(arr));

    }
}
