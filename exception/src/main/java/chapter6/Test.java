package chapter6;

/**
 * Created by Mayank on 12/1/2015.
 */
public class Test {

    public static void main(String[] args) {
        int [] x = new int[3];
        for(int i : x){
            System.out.println(i);
        }

        int h = x[0];

        Integer[] s = new Integer[3];

        for (Integer c : s){
            System.out.println(c);
        }

        String[] strs = new String[0];

        String s1 = strs[0];

        for (String str : strs){
            System.out.println(str);
        }



    }

}
