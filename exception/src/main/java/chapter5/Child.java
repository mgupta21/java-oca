package chapter5;

/**
 * Created by Mayank on 12/26/2015.
 */
public class Child extends Parent {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();
        child = (Child) parent;


    }

}
