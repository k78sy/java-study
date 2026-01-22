package starcraft;

public class StarMain2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();
        Tank t4 = new Tank();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Marine m1 = new Marine();
        System.out.println(m1);
        Marine m2 = new Marine();
        Marine m3 = new Marine();
        Marine m4 = new Marine();
        Marine m5 = new Marine();

        Dropship dropship = new Dropship();

        dropship.load(t1);
        dropship.load(t2);
        dropship.load(m1);
        dropship.load(m2);
        dropship.load(m3);
        dropship.load(m4);
        dropship.load(m5);
        dropship.load(t4);

        dropship.load(t1);
        dropship.load(t2);
        dropship.load(m1);

        dropship.check();

        Unit u1 = dropship.unload(2);
        System.out.println("unload Unit: "+ u1);
        Unit u2 = dropship.unload(2);
        System.out.println("unload Unit: "+ u2);

        dropship.check();
    }
}
