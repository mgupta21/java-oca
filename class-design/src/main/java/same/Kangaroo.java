package same;

/**
 * Created by Mayank on 11/20/2015.
 */
public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }

    public int val = 4;

    public boolean isHiped(){
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + super.isBiped());
    }

    public void getKDesc(){
        System.out.println("Kangaroo : " + isHiped());
    }

    public void overriden(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        joey.getMDesc();
        joey.getKDesc();

        Marsupial mar = new Kangaroo();
        System.out.println(mar.isBiped());
        System.out.println(joey.isBiped());

        System.out.println(mar.isHiped());
        System.out.println(joey.isHiped());

        System.out.println(mar.val);
        System.out.println(joey.val);

        mar.overriden();
    }

    /*
        Marsupial walks on two legs: false
        Kangaroo hops on two legs: true
        true
     */
}
