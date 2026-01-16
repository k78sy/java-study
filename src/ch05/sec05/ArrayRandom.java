package ch05.sec05;

import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args){
        int rVal = (int)((Math.random() * 9.0) + 1);

        int[] arr = new int[9];
        // arr 각 방에 랜덤한 값(1~9) 대입해주세요.
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)((Math.random() * 9.0) + 1);
        }
        System.out.println("arr: " + Arrays.toString(arr));

        int[] arr2 = new int[9];
        for(int i=0;i<arr2.length;i++){ //값 대입 담당
            arr2[i] = (int)((Math.random() * 9.0) + 1);

            // i=0  0<0=안쪽 for문 돌아가지않음
            // i=1 k=0

            for(int k=0; k<i; k++){ //중복 확인 담당
                if(arr2[k] == arr2[i]){
                    i--;
                    break;
                }
            }
        }
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
