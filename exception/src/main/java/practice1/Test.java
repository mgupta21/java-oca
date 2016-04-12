package practice1;

/**
 * Created by Mayank on 12/12/2015.
 */
public class Test {

    public static void main(String[] args) {
        String year = "Senior";
        switch (year) {
            case "Freshman" :
            default:
            case "Sophomore":
            case "Dropper" :
                System.out.println("Sorry..!!"); break;
            case "Senior" :
                System.out.println("Congratulations..!!");

        }

        StringBuilder sb = new StringBuilder();
        sb.append("maybe").insert(2, "sh").insert(5, "xy");
        System.out.println(sb.toString());

    }

}


