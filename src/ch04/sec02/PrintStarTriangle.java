package ch04.sec02;

public class PrintStarTriangle {
    public static void main(String[] args){
        // 3~6 랜덤숫자
        int star = (int) ((Math.random() * 4.0) + 3);
        System.out.print("star :" +star);

        // star = 3
        // i = 0 하나를 찍고 바로 내려가야함

        // i = 0 k=0
        // i = 1, k=0, 1
        // i = 2, k=0,1,2

        for(int i=0; i<star; i++){
            System.out.println();
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
        }
    }
}
