package same;

/**
 * Created by Mayank on 11/20/2015.
 */
public class Marsupial {

    public int val = 8;

    public static boolean isBiped() {
        return false;
    }

    public boolean isHiped(){
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public void getMDesc(){
        System.out.println("Marsupial : " + isHiped());
    }

    public void overriden(){
        System.out.println("parent");
    }


    public static void main(String[] args) {
        Kangaroo hoey = new Kangaroo();
        System.out.println(hoey.isBiped());
       hoey.getMarsupialDescription();
    }
}
