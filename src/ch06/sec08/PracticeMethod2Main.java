package ch06.sec08;

import java.util.Arrays;

public class PracticeMethod2Main {
    public static void main(String[] args){
        PracticeMethod2 pm = new PracticeMethod2();

        String randomFileName = pm.getRandomFileName();
        System.out.println("randomFileName: " + randomFileName);

        String originalFileName = "크크캬크크dsj-djdjdj.hahahahfffhha.jpeg";
        String ext = pm.getExt(originalFileName);
        System.out.println("확장자명: " + ext);

        String fileName = pm.onlyFileName(originalFileName);
        System.out.println("원본파일명: " + fileName);

        // 파일명만 래덤하고 확장자만 같게
        String rFileName2 = pm.getRandomFileName(originalFileName);
        System.out.println("랜덤파일명: " + rFileName2);

        //배열
        int[] arr = {10, 5, 8, 11};
        int[] arr5 = {-10, -5, -8, -11,-20};

        int sum = pm.sumArr(arr); // 배열의 모든 값 더한 뒤 리턴
        System.out.println("arr 합계: " + pm.sumArr(arr));
        int[] arr21 = {10, 5, 8, 11, 9, 7};
        System.out.println("arr2 합계: " + pm.sumArr(arr21));

        int[] arr2 = pm.deepCopy(arr);
        System.out.println("deppCopy: " + Arrays.toString(arr2));

        int max = pm.getMax(arr5);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + pm.getMin(arr5));

        System.out.printf("최대값: %d, 최소값: %d", pm.getMaxMin(arr)[0], pm.getMaxMin(arr)[1]);
    }
}
