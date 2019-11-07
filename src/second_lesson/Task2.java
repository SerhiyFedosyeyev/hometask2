package second_lesson;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        ArrayList<String> list2 = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            list.get(i);
            System.out.println(list.get(i));
            list2.add(list.get(i));

        }
        list=list2;
        list2.clear();


        System.out.println(list);


    }



}
