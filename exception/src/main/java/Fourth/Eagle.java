package Fourth;

/**
 * Created by Mayank on 11/30/2015.
 */
public class Eagle extends Bird {

    public int fly(int height) { // Compile OK. Overloaded method can have different return type
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
   /* public int eat(int food) { // DOES NOT COMPILE . Overridden method must have same return type as parent
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }*/

    public void eat(int food) { // DOES NOT COMPILE . Overridden method must have same return type as parent
        System.out.println("Eagle is eating "+food+" units of food");
    }

    public static void sleep() {
        System.out.println("Eagle is sleeping");
    }

    public static int hasEggs(int y) {
        return 0;
    }

    public static int sleep(int i){
        System.out.println("Eagle is sleeping for " + i + " number of hours");
        return i;
    }

    public static void main(String[] args) {
        Bird bird1 = new Eagle();
        bird1.eat(1);
        bird1.sleep();
        /*bird1.sleep(1);
        bird1.fly(1);*/

        new Bird().eat(2);
        new Bird().sleep();



        Bird bird2 = new Bird();
        bird2.eat(3);
        bird2.sleep();
    }

}
