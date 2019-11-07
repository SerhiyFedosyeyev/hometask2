package second_lesson;

import java.util.*;

public class Task3 {
  public static void showHashSetList(Set<String> str)
  {
    Iterator<String> iterLinked = str.iterator();
    while(iterLinked.hasNext())
    {
      System.out.println(iterLinked.next());
    }
    System.out.println("");


  }
  public static void showLinkedList(LinkedList<String> str)
  {
    Iterator<String> iterLinked = str.iterator();
     while(iterLinked.hasNext())
    {
      System.out.println(iterLinked.next());
    }
    System.out.println("");


  }

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


        System.out.println("HashSet before");
        showHashSetList(listHash);
        System.out.println("Linked List");
        showLinkedList(listLinked);
        listHash.retainAll(listLinked);
        System.out.println("Hashset after:");
        showHashSetList(listHash);




    }


}
