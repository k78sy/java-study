package ch06.sec08;

public class PracticeMethod {
    public void abs(int num){
        System.out.println("넣은값:"+ num + " 절대값:" + (num<0?-num:num));
    }
    public int random(int num){
        return (int)(Math.random() * num);
    }
    public int random(int min, int max){
        return (int)((Math.random() * (max-min)) + min);
    }

    // 2023.1.19
    public String getGrade(int score){
        if(score > 90){
            return "A";
        }else if(score > 80){
            return "B";
        }else{
            return "C";
        }
    }

    public void printStar(int num){
        System.out.println();
//        for(int i=0; i<num; i++){
//            System.out.print("*");
//        }
        String star = "*";
        for(int i=0; i<num; i++){
            System.out.print(star);
        }
    }

//    public void printStarTraiangle(int str){
//        for(int i=0;i<str; i++){
//            for(int k=0; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
    public void printStarTraiangle(int star){
        for(int i=0;i<star; i++){
            printStar(i);
        }
        System.out.println();
    }
    public void printStarRectangle(int star){
        for(int i=0; i<star; i++){
            printStar(star);
        }
        System.out.println();
    }
    public void printStarP(int star){
        for(int i=0; i<star; i++){
            printStar(i);
        }
        for(int i=star; i>0; i--){
            printStar(i);
        }
        System.out.println();
    }
    public void gugudan(int num){
        for(int i=1; i<=9; i++){
            int result = num * i;
            System.out.printf("%d X %d = %02d\n", num, i, result);
        }
//        System.out.println();
//        for(int i=1; i<=9; i++){
//            int result = num * i;
//            System.out.println(num + "X" + i + "=" + result);
//        }
    }
    public void gugudan(int start, int end){
        for(int k=start; k<=end; k++) {
            System.out.printf("----%d단----\n",k);
            gugudan(k);
        }
    }
    public int sum(int startNum, int endNum){
        int sum = 0;
        for(int i=startNum; i<=endNum; i++){
            sum += i;
        }
        return sum;
    }
}
