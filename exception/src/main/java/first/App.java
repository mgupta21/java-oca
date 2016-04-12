package first;

import java.io.IOException;

/**
 * Created by Mayank on 11/21/2015.
 */
public class App {

    int x;
    public static void main(String[] args) throws NoClassDefFoundError {

        int total = 0;
        int a;
        try {
            int[] countsOfMoose = new int[3];
            for (int i =0; i<countsOfMoose.length ; i++){
                total +=countsOfMoose[i];
            }
            // throw new NoClassDefFoundError();
            //throw new RuntimeException();
        } catch (TwoException ex){
           System.out.println("One Exception");
        } catch (OneBException ex) {
            System.out.println("Two Exception");
        }/*catch (OneBException ex) {
            System.out.println("One B Exception ");
        }*/
         catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } /*catch (IOException ex){
            System.out.println("IO Exception");
        }*/ /*catch (NoClassDefFoundError e){

        }*/

        System.out.println("Total : " + total);
        System.out.println("A : " + new App().x);

        App app = new App();
        app.test();
        try {
            app.debug();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void test() throws RuntimeException {
        System.out.println("Tested");
    }

    public void debug() throws Exception{
        System.out.println("debug");
    }
}