package ch05.sec05;
// 다차원 배열
public class MultiArray {
    public static void main(String[] args){
        /*
        다차원 배열 (2차원배열)
        배열 안에 배열이 있는 것.

        * */

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90, 855},
                {100, 110, 120}
        };

        // int[] arr2 = arr; 이러면 안들어감

        System.out.println("arr.length: " + arr.length); // 4
        System.out.println("arr[0].length: " + arr[0].length); // 3
        System.out.println("arr[0][0]: " + arr[0][0]); // arr[0]에 있는 배열의 [0] = 10

        System.out.println("arr[2][1]: " + arr[2][1]);

        System.out.println("---------------------------------");

        for(int i =0; i<arr.length;i++){
            for(int k=0; k<arr[i].length; k++){
                System.out.printf("%d ", arr[i][k]);
            }
            System.out.println();
        }
    }
}
