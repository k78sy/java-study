package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName(){
        return UUID.randomUUID().toString();
        //UUID(Universally Unique Identifier)
        //전 세계적으로 고유하게 만들어진 128비트 식별자
    }
    public String getRandomFileName(String fullFileName){
        return getRandomFileName() + getExt(fullFileName);
    }

    public String getExt(String fullFileName){
        int idx = fullFileName.lastIndexOf(".");
        String extension = fullFileName.substring(idx);
        return extension;
    }

    public String onlyFileName(String fullFileName){
        int idx = fullFileName.indexOf(getExt(fullFileName));
        String filename = fullFileName.substring(0, idx);
        return filename;
    }

    public int sumArr(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int[] deepCopy(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public int getMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public int getMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int[] getMaxMin(int[] arr){
        int max = arr[0], min = arr[0];
        int[] temp = new int[2];

        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        temp[0] = max;
        temp[1] = min;
        return temp;
    }
}
