package second_lesson;
import java.util.HashMap;
import java.util.Iterator;


public class Task1 {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Test","7");
        hm.put("Class","4.5");
        hm.put("Cat","true");
        hm.put("Dog","null");
        hm.put("Bird","Cat");
        hm.put("Something","new Long(83)");
        hm.put("Mail","new Character('8')");
        hm.put("Tab","2");
        hm.put("Browser","22222222222L");
        hm.put("IDE"," (double) 489");


      //  Iterator iter = hm.

        for (String s :hm.keySet()) {
            System.out.println( s + "--> " + hm.get(s));

        }

    }

}
