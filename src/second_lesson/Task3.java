package second_lesson;

import java.util.*;

public class Task3 {

      public static void main(String[] args) {


        Set<String> listHash= new HashSet<String>();
        listHash.add("pineapple");
        listHash.add("watermelon");
        listHash.add("apple");
        listHash.add("pear");
        listHash.add("quince");
        listHash.add("lemon");
        listHash.add("kiwi");


        LinkedList<String> listLinked = new LinkedList<String>();
        listLinked.add("plum");
        listLinked.add("nut");
        listLinked.add("apple");
        listLinked.add("grape");
        listLinked.add("peach");
        listLinked.add("pear");
        listLinked.add("cherry");
        listLinked.add("orange");
        listLinked.add("watermelon");
        listLinked.add("apricot");
        listLinked.add("pineapple");

        Iterator<String> iterLinked = listLinked.iterator();
        System.out.println("Linked List ");
        while(iterLinked.hasNext())
        {
            System.out.println(iterLinked.next());
        }
        System.out.println("");

        Iterator<String> iterHach = listHash.iterator();
        System.out.println("HashSet list");
        while (iterHach.hasNext())
        {
            System.out.println(iterHach.next());
        }
        System.out.println(" ");

          Iterator newIterator = listHash.iterator();

          for ( String s : listHash)
          {
              if (!listLinked.contains(s)) {
                  System.out.println("not contains : " + s);
                //  newIterator.remove(s);
              }
          }



          System.out.println(listHash);



    }
}
