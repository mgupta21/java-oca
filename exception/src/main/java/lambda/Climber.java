package lambda;

/**
 * Created by Mayank on 12/13/2015.
 */
public class Climber {
    public static void main(String[] args) {
        check((h,l) -> h > l ,5);
    }

    private static void check(Climb climb, int height) {
        if(climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}

interface Climb {
    boolean isTooHigh(int height, int limit);
}
