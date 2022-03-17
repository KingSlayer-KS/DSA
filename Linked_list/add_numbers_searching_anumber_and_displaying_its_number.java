package Linked_list;

import java.util.LinkedList;

public class add_numbers_searching_anumber_and_displaying_its_number {
    public static void main(String[] args) {

        LinkedList<Integer> lli = new LinkedList<Integer>();
        lli.add(1);
        lli.add(5);
        lli.add(7);
        lli.add(3);
        lli.add(8);
        lli.add(2);
        lli.add(3);
        for (int i=0;i<lli.size();i++) {
            if(lli.get(i)==7){
                System.out.println("7 is at index : "+i);
            }
        }
    }
}
