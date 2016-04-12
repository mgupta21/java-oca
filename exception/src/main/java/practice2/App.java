package practice2;

import java.time.LocalDate;

/**
 * Created by Mayank on 12/14/2015.
 */
public class App {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        if(sb1 == sb2) System.out.println("one");
        if(sb1.equals(sb2)) System.out.println("two");
        // if (sb1 == "meow") System.out.println();
        if (sb1.toString() == "hello")System.out.println("four");

        // LocalDate d = LocalDate.of(2015, 5);

        String tiger = "Tiger";
        String lion = "Lion";
        final String statement = 250 > 238 ? lion : (tiger = " is bigger ");
        System.out.println(statement);

        int i =1;
        Integer i1 = 1;
        int x = 1;
        System.out.println("##############");
        System.out.println(i==i1);
        System.out.println(i==x);
        System.out.println(i1.equals(i));


        int xz =5;
        switch (xz/0){
            case 1:
                System.out.println("hello");

        }

    }
}
