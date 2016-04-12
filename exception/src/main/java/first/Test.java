package first;

import java.sql.*;
//

/**
 * Created by Mayank on 11/28/2015.
 */
class TestMe {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }


        Object x[] = new String[3];
        //x[0] = new Integer(0);
        x[0] = new String("hello");

    }
}
