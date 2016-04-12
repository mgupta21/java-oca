package same;

/**
 * Created by Mayank on 11/20/2015.
 */
public class Child extends Parent {

    public void one(){
        System.out.println("Child one");
    }

    public void two (){
        System.out.println("Child two");
    }


    public static void main(String[] args) {
        Child child = new Child();
        child.one();

        Parent parent = new Parent();
        parent.one();

        Parent parent1 = new Child();
        parent1.one();
       // parent1.two(); // No Compile
        Child child1 = (Child) new Parent();
        child1.one();

    }

}
