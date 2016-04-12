package Fourth;

/**
 * Created by Mayank on 11/30/2015.
 */
public class Bird {

    // public void fly (int numMiles) { }
    //public int fly(int numMiles) { }

    /*public int fly() { return 0;}*/

    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }

    public static void sleep() {
        System.out.println("Bird is sleeping");
    }

    public static boolean hasEggs(){
        return true;
    }

    /*private void fly(int numMiles, int s) { }
    public void fly(int numMiles) { }
    public void fly(short numFeet) { } // Different type of param than one in line 1
    private int fly(long num) { return 0;} // Ok. Compil*//*
    //public int fly (int numMiles) {return numMiles;} // Does Not Compile // fly (int _) signature already defined in line 1
*/
}
