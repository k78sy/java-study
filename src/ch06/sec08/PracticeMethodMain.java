package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args){
        //PracticeMethod
        PracticeMethod pm = new PracticeMethod();

        pm.abs(10);
        pm.abs(-10);
        pm.abs(-8);

        int r1 = pm.random(10); //0~9랜덤값 리턴
        int r2 = pm.random(20); //0~20랜덤값 리턴
        System.out.println("r1: " + r1 + ", r2: " + r2);

        int r3 = pm.random(2,10); //2~9 랜덤값 리턴
        int r4 = pm.random(10,15); //10~14 랜덤값 리턴
        System.out.println("r3: " + r3 + ", r4: " + r4);

        // 2026.1.19
        /* 90점 초과는 콘솔에 A, 80점 초과는 B, 나머지는 C 리턴*/
        String grade = pm.getGrade(100);
        System.out.println("grade: " + grade);

        String grade2 = pm.getGrade(60);
        System.out.println("grade2: " + grade2);

        int score = (int)((Math.random() * 81.0) + 20);
        String grade3 = pm.getGrade(score);
        System.out.printf("%d점 %s", score, grade3);

        System.out.println("-----------------");
        pm.printStar(5); //*****
        pm.printStar(3); //***

        pm.printStar(pm.random(1,6));
        System.out.println("-----------------");
        pm.printStarTraiangle(4);
        //*
        //**
        //***
        //****
        System.out.println("-----------------");
        pm.printStarRectangle(4);
        //****
        //****
        //****
        //****
        System.out.println("-----------------");
        pm.printStarP(pm.random(3,6));
        System.out.println("-----------------");
        pm.gugudan(5);
        // 5 X 1 =5;
        // 5 X 2 =10;
        // .
        // 5 X 9 =45;
        System.out.println("-----------------");
        pm.gugudan(3,6);

        int sum = pm.sum(10,50); //10~50까지 순차적으로 더한 값을 리턴
        System.out.println("합계: " + sum);
        // 1 2 3 4 5
    }
}
