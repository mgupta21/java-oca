package Trial;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 12/3/2015.
 */
public class Trial {

    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0.8180918478473);

        System.out.println(bigDecimal);


        String s = "amimals";
        System.out.println(s.substring(3));

        String bugs [] = {"cat", "dog"};
        String[] bugs2 = bugs;
        String[] bugs3 = {"cat", "dog"};

        System.out.println(bugs.equals(bugs2));
        System.out.println(bugs.equals(bugs3));

        Integer.valueOf(34);

        List<String> list = new ArrayList();
        list.add("mayank");
        list.add("karan");


        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(LocalDateTime.now().format(f));
        System.out.println(f.format(LocalDateTime.now()));


    }

}
