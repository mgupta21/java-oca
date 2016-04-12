package practice1;

/**
 * Created by Mayank on 12/12/2015.
 */
public abstract class Otter {
    protected abstract void eatFish(int count);
}

class Inner extends Otter {
    //protected void eatFish(int number) {}
    protected void eatFish() {}
    public void eatFish(int count){}
}
