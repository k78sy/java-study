package ch04.sec02;

public class PrintStarRectangle {
    public static void main(String[] args) {
        // 3~6 랜덤숫자
        int star = (int) ((Math.random() * 4.0) + 3);
        System.out.print(star);

        for(int i=0; i<star; i++){
            System.out.print("\n");
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
        }
    }
}