package practice1;

/**
 * Created by Mayank on 12/12/2015.
 */
public interface HasHindLegs {
    int getLength();
}

class Rabbit implements HasHindLegs {
    @Override
    public int getLength() {
        return 0;
    }
    // int getLength() { return 0;} // Does Not Compile //
}