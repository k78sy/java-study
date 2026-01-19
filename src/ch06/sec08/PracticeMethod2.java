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
}
