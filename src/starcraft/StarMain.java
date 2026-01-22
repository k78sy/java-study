package starcraft;

public class StarMain {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        t1.changeMode(); // 시즈 모드 ON
        t1.changeMode(); // 시즈 모드 OFF
        t1.changeMode(); // 시즈 모드 ON
    }
}
