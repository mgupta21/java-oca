package same;

/**
 * Created by Mayank on 11/21/2015.
 */
public class Owl extends Nocturnal {
    public boolean isBlind(){
        return false;
    }

    public static void main(String[] args) {
        Nocturnal nocturnal = new Owl();
        System.out.println(nocturnal.isBlind());

        Nocturnal nocturnal1 = new Nocturnal();
        System.out.println(nocturnal1.isBlind());
    }
}
