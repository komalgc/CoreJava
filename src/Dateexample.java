import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateexample {


    public static void main(String[] args) {

     Date dd = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyy");

        System.out.println(sdf.format(dd));


        System.out.println(dd.toString());
    }
}
