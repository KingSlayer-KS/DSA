package Basic_stuff;

import java.util.*;

public class arylst {
    public static void main(String[] args) {
        //Syntax: ArrayList<Integer> name = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // add elements
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        // get elements
        list2.get(0);/* gets valueat at index 0 */
        System.out.println(list2.get(4));
        // add element in btween
        /*
         * when we use list.add() it adds to the end of list
         * when we ant to add the eement at desired location we use list.add with first
         * argument being the positon we want to add and followed by the the value
         */
        list2.add(1, 99);// insert value->99 ait indx->1
        System.out.println(list2);
        list2.add(0, 29);
        System.out.println(list2);

        // delete element
        list2.remove(2);// remove value of index->2
        System.out.println(list2);

        // sie of arry list
        System.out.println(list2.size());

        // loops on arry list
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        // sorting
        Collections.sort(list2);// sort function of collections class
        System.out.println(list2);

    }
}
