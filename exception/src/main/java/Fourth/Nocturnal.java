package Fourth;

/**
 * Created by Mayank on 12/8/2015.
 */
public interface Nocturnal {
    /*default boolean isBlind() {
        return true;
    }*/
}

class Owl implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main (String[] args) {
       /* Nocturnal nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());*/
    }

}