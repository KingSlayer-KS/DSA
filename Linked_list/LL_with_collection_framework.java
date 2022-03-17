package Linked_list;

import java.util.LinkedList;

public class LL_with_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("name");
        list.addLast("is");
        System.out.println(list);

        // default for add ==> addlast, we have to specify addfirst for add to first
        list.add("sirjan");
        list.addFirst("The");
        System.out.println(list);
        System.out.println(list.size());

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("Null");

        System.out.println();


        //itersting throught list
        for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
        }
        System.out.println("Null");
        System.out.println();
        
        //remove first
        list.removeFirst();
        System.out.println(list);
        System.out.println();

        //remove last
        list.removeLast();
        System.out.println(list);
        System.out.println();

        //remove from an index
        list.remove(0);
        System.out.println(list);
        System.out.println();

        //conditional on list
        if(list.size()>0){
            System.out.println("not_MT");
        }
        

        

    }
}
